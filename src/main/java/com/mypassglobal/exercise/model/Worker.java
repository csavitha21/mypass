package com.mypassglobal.exercise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Worker {
    private String workerID;
    private String workerName;
    private List<Qualification> qualifications;
    private List<TrainingProgram> trainingPrograms;
    private String href;

    public Worker(String id, String name, List<Qualification> qualifications, List<TrainingProgram> trainingPrograms, String link) {
        this.workerID = id;
        this.workerName = name;
        this.qualifications = qualifications;
        this.trainingPrograms = trainingPrograms;
        this.href = link+id;
    }
}
