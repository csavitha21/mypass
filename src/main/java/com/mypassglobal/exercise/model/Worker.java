package com.mypassglobal.exercise.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
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

    @Column(name = "href")
    private String href;

    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Qualification> qualifications;

    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<TrainingProgram> trainingPrograms;

    @ManyToOne
    @JoinColumn(name = "projectId", nullable = false)
    @JsonBackReference
    private Project project;

    public Worker(String id, String name, List<Qualification> qualifications, List<TrainingProgram> trainingPrograms, String link) {
        this.workerId = id;
        this.workerName = name;
        this.qualifications = qualifications;
        this.trainingPrograms = trainingPrograms;
        this.href = link+id;
    }
}
