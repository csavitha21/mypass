package com.mypassglobal.exercise.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String workerId;

    @Column(name = "workerName")
    private String workerName;

    @Transient
    private String href="/mypass/v1/projects/workers/";

    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Qualification> qualificationList;

    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<TrainingProgram> trainingProgramList;

    @ManyToOne
    @JoinColumn(name = "projectId", nullable = false)
    @JsonBackReference
    private Project project;

    public Worker(String id, String name, List<Qualification> qualificationList, List<TrainingProgram> trainingProgramList, String link) {
        this.workerId = id;
        this.workerName = name;
        this.qualificationList = qualificationList;
        this.trainingProgramList = trainingProgramList;
        this.href = link+id;
    }

    @PostLoad
    public void postLoad() {
        this.href=this.getHref()+this.getWorkerId();
    }
}
