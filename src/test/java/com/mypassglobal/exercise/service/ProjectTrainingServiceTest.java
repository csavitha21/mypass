package com.mypassglobal.exercise.service;

import com.mypassglobal.exercise.model.Project;
import com.mypassglobal.exercise.model.Qualification;
import com.mypassglobal.exercise.model.TrainingProgram;
import com.mypassglobal.exercise.model.Worker;
import com.mypassglobal.exercise.repository.ProjectRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProjectTrainingServiceTest {

    @Mock
    private ProjectRepo mockProjectRepo;

    @InjectMocks
    private ProjectTrainingService projectTrainingServiceUnderTest;

    @Test
    void testLoadData() {
        projectTrainingServiceUnderTest.loadData();
    }

    @Test
    void testGetWorkerDetailsForProjectId() {
        // Setup
        final Worker worker = new Worker();
        worker.setWorkerId("workerId");
        final Qualification qualification = new Qualification();
        qualification.setQualificationName("qualificationName");
        worker.setQualificationList(List.of(qualification));
        final TrainingProgram trainingProgram = new TrainingProgram();
        trainingProgram.setProgramName("programName");
        trainingProgram.setStatus("status");
        worker.setTrainingProgramList(List.of(trainingProgram));
        final List<Worker> expectedResult = List.of(worker);

        // Configure ProjectRepo.findById(...).
        final Project project1 = new Project();
        final Worker worker1 = new Worker();
        worker1.setWorkerId("workerId");
        final Qualification qualification1 = new Qualification();
        qualification1.setQualificationName("qualificationName");
        worker1.setQualificationList(List.of(qualification1));
        final TrainingProgram trainingProgram1 = new TrainingProgram();
        trainingProgram1.setProgramName("programName");
        trainingProgram1.setStatus("status");
        worker1.setTrainingProgramList(List.of(trainingProgram1));
        project1.setWorkerList(List.of(worker1));
        project1.setProjectId(String.valueOf(Long.valueOf("1")));
        final Optional<Project> project = Optional.of(project1);
        when(mockProjectRepo.findById(0L)).thenReturn(project);

        // Run the test
        final List<Worker> result = projectTrainingServiceUnderTest.getWorkerDetailsForProjectId("0",
                "qualificationName", "trainingProgramName", 0, 0);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetWorkerDetailsForProjectId_ProjectRepoReturnsAbsent() {
        // Setup
        when(mockProjectRepo.findById(0L)).thenReturn(Optional.empty());

        // Run the test
        final List<Worker> result = projectTrainingServiceUnderTest.getWorkerDetailsForProjectId("0",
                "qualificationName", "trainingProgramName", 0, 0);

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }

    @Test
    void testGetWorkerDetailsForProjectIdAndWorkerId() {
        // Setup
        // Run the test
        final Optional<Object> result = projectTrainingServiceUnderTest.getWorkerDetailsForProjectIdAndWorkerId(
                "workerId");

        // Verify the results
    }
}
