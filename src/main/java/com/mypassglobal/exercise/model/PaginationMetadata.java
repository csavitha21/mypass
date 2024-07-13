package com.mypassglobal.exercise.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaginationMetadata {
    private int totalWorkers;
    private int perPage;
    private int currentPage;
    private int totalPages;
    private String nextPageUrl;
    private String prevPageUrl;
}

