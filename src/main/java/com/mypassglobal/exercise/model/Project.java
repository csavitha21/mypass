package com.mypassglobal.exercise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Project {
    private String projectID;
    private String projectName;
    private List<Worker> workerList;
}
