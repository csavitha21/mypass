package com.mypassglobal.exercise.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ApiResponse {
    private List<Worker> workerList;
    private PaginationMetadata metadata;
}
