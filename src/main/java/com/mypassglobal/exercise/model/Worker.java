package com.mypassglobal.exercise.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
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

    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    @JsonManagedReference
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Qualification> qualificationList;

    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    @JsonManagedReference
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<TrainingProgram> trainingProgramList;

    @ManyToOne
    @JoinColumn(name = "projectId", nullable = false)
    @JsonBackReference
    private Project project;

    @Transient
    private String href="/mypass/v1/projects/workers/";

    public Worker(String id, String name, List<Qualification> qualificationList, List<TrainingProgram> trainingProgramList, String link) {
        this.workerId = id;
        this.workerName = name;
        this.qualificationList = qualificationList;
        this.trainingProgramList = trainingProgramList;
        this.href = link+id;
    }

    public Worker(Worker worker, boolean includeQualification, boolean includeTraining) {
        this.workerId = worker.getWorkerId();
        this.workerName = worker.getWorkerName();
        this.href = worker.getHref();
        if (includeQualification && worker.getQualificationList() != null) {
            this.qualificationList = worker.getQualificationList();
        } else {
            this.qualificationList = null; // Set qualification to null conditionally
        }
        if (includeTraining && worker.getTrainingProgramList() != null) {
            this.trainingProgramList = worker.getTrainingProgramList();
        } else {
            this.trainingProgramList = null; // Set qualification to null conditionally
        }
    }


    @PostLoad
    public void postLoad() {
        this.href=this.getHref()+this.getWorkerId();
    }
}
