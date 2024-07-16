package com.mypassglobal.exercise.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TrainingProgramTest {

    @Mock
    private Worker mockWorker;

    private TrainingProgram trainingProgramUnderTest;

    @BeforeEach
    void setUp() {
        trainingProgramUnderTest = new TrainingProgram("id", "programName", "completionDate", "status", mockWorker);
    }
}
