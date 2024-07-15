package com.mypassglobal.exercise.repository;

import com.mypassglobal.exercise.model.TrainingProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingProgramRepo extends JpaRepository<TrainingProgram, Long> {
}
