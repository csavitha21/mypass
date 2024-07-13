package com.mypassglobal.exercise.controller;

import com.mypassglobal.exercise.model.ApiResponse;
import com.mypassglobal.exercise.model.PaginationMetadata;
import com.mypassglobal.exercise.model.Worker;
import com.mypassglobal.exercise.service.ProjectTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mypass/v1/projects")
public class ProjectTrainingController {

    @Autowired
    private ProjectTrainingService projectTrainingService;

    @GetMapping("/{projectId}/workers")
    public ResponseEntity getWorkersForProject(@PathVariable Long projectId,
                                               @RequestParam(required = false) String qualificationName,
                                               @RequestParam(required = false) String trainingProgramName,
                                               @RequestParam(defaultValue = "0") int page,
                                               @RequestParam(defaultValue = "5") int perPage) {
        List<Worker> workers = projectTrainingService.getWorkerDetailsForProjectId(projectId.toString(), qualificationName, trainingProgramName, page, perPage);
        if (!workers.isEmpty()) {

            String nextPageUrl = "/mypass/v1/projects/" + projectId.toString() + "/workers", prevPageUrl = "/mypass/v1/projects/" + projectId.toString() + "/workers";

            // Determine total pages
            int totalPages = (int) Math.ceil((double) workers.size() / perPage);
            // Determine URLs for next and previous pages
            if (page < totalPages) {
                nextPageUrl = nextPageUrl + "?page=" + (page + 1) + "&per_page=" + perPage;
            }
            if (page > 1) {
                prevPageUrl = prevPageUrl + "?page=" + (page - 1) + "&per_page=" + perPage;
            }
            // Create metadata for pagination
            PaginationMetadata paginationMetadata = new PaginationMetadata(workers.size(), perPage, page, totalPages, nextPageUrl, prevPageUrl);


            // Create API response object with data and metadata
            ApiResponse response = new ApiResponse(workers,paginationMetadata);
            return ResponseEntity.ok(response);
        } else {
            throw new ResourceNotFoundException("Project ID not found");
        }
    }

    @GetMapping("/workers/{workerId}")
    public ResponseEntity getWorkersForProject(@PathVariable String workerId) {
        Optional<Object> workers = projectTrainingService.getWorkerDetailsForProjectIdAndWorkerId(workerId);
        if (!workers.isEmpty()) {
            return ResponseEntity.ok(workers);
        } else {
            throw new ResourceNotFoundException("Worker ID not found");
        }
    }


}