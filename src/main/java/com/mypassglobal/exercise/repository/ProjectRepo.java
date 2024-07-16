package com.mypassglobal.exercise.repository;

import com.mypassglobal.exercise.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {

  /*  @Query("SELECT DISTINCT p FROM Project p " +
            "JOIN p.workerList w " +
            "JOIN w.qualificationList q " +
            "JOIN w.trainingProgramList t " +
            "WHERE p.projectId = :projectId " +
            "AND t.wokerId = w.workerId " +
            "AND t.status = 'Completed'")
    List<Project> findProjectsWithWorkersAndCompleteTrainings(@Param("projectId") Long projectId);*/

    //Page<Project> findAll(Pageable pageable);

}
