package com.mypassglobal.exercise.repository;

import com.mypassglobal.exercise.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepo extends JpaRepository<Worker, Long> {
}
