package com.mypassglobal.exercise.repository;

import com.mypassglobal.exercise.model.Qualification;
import com.mypassglobal.exercise.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerRepo extends JpaRepository<Worker, Long> {

    @Query("SELECT w FROM Worker w JOIN w.qualificationList q WHERE q.name = :qualificationName")
    List<Worker> findByQualification(@Param("qualificationName") String qualificationName);

    @Query("SELECT w FROM Worker w JOIN w.trainingProgramList t WHERE t.programName = :programName")
    List<Worker> findByTrainingProgramName(@Param("programName") String programName);

}
