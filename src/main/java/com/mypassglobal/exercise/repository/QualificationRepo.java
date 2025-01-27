package com.mypassglobal.exercise.repository;

import com.mypassglobal.exercise.model.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationRepo extends JpaRepository<Qualification, Long> {
}
