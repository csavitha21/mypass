package com.mypassglobal.exercise.service;

import com.mypassglobal.exercise.model.Project;
import com.mypassglobal.exercise.model.Qualification;
import com.mypassglobal.exercise.model.Worker;
import com.mypassglobal.exercise.repository.ProjectRepo;
import com.mypassglobal.exercise.repository.QualificationRepo;
import com.mypassglobal.exercise.repository.WorkerRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProjectTrainingService {

    @Autowired
    private ProjectRepo projectRepo;

    @Autowired
    private WorkerRepo workerRepo;

    @Autowired
    private QualificationRepo qualificationRepo;

    private List<Project> projects;

    @PostConstruct
    public void loadData() {

        // 1
        /*List<Qualification> qualifications11 = Arrays.asList(new Qualification("AWS Certified", "12/07/2023"),
                new Qualification("Java Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms11 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "Front-end development", "15/03/2024", "Completed"),
                new TrainingProgram(UUID.randomUUID().toString(), "Back-end development", "15/12/2024", "In-Progress"));
        String link = "/mypass/v1/projects/workers/";
        Worker worker11 = new Worker(UUID.randomUUID().toString(), "Sam", qualifications11, trainingPrograms11, link);

        List<Qualification> qualifications12 = Arrays.asList(new Qualification("AWS Certified", "12/01/2025"),
                new Qualification("NodeJs Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms12 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "Back-end development", "15/12/2024", "In-Progress"));
        Worker worker12 = new Worker(UUID.randomUUID().toString(), "Paul", qualifications12, trainingPrograms12, link);


        List<Qualification> qualifications13 = Arrays.asList(new Qualification("Java Certified", "12/07/2026"),
                new Qualification("NodeJs Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms13 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "Back-end development", "15/2/2024", "In-Progress"));
        Worker worker13 = new Worker(UUID.randomUUID().toString(), "John", qualifications13, trainingPrograms13, link);

        List<Qualification> qualifications14 = Arrays.asList(new Qualification("AWS Certified", "12/07/2023"),
                new Qualification("Java Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms14 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "Front-end development", "15/03/2024", "Completed"),
                new TrainingProgram(UUID.randomUUID().toString(), "Back-end development", "15/12/2024", "In-Progress"));
        Worker worker14 = new Worker(UUID.randomUUID().toString(), "Sam", qualifications14, trainingPrograms14, link);

        List<Qualification> qualifications15 = Arrays.asList(new Qualification("AWS Certified", "12/01/2025"),
                new Qualification("NodeJs Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms15 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "Back-end development", "15/12/2024", "In-Progress"));
        Worker worker15 = new Worker(UUID.randomUUID().toString(), "Paul", qualifications15, trainingPrograms15, link);


        List<Qualification> qualifications16 = Arrays.asList(new Qualification("Java Certified", "12/07/2026"),
                new Qualification("NodeJs Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms16 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "Back-end development", "15/2/2024", "Completed"));
        Worker worker16 = new Worker(UUID.randomUUID().toString(), "John", qualifications16, trainingPrograms16, link);

        List<Qualification> qualifications17 = Arrays.asList(new Qualification("AWS Certified", "12/07/2023"),
                new Qualification("Java Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms17 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "Front-end development", "15/03/2024", "Completed"),
                new TrainingProgram(UUID.randomUUID().toString(), "Back-end development", "15/12/2024", "In-Progress"));
        Worker worker17 = new Worker(UUID.randomUUID().toString(), "Sam", qualifications17, trainingPrograms17, link);

        List<Qualification> qualifications18 = Arrays.asList(new Qualification("AWS Certified", "12/01/2025"),
                new Qualification("NodeJs Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms18 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "Back-end development", "15/12/2024", "In-Progress"));
        Worker worker18 = new Worker(UUID.randomUUID().toString(), "Paul", qualifications18, trainingPrograms18, link);


        List<Qualification> qualifications19 = Arrays.asList(new Qualification("Java Certified", "12/07/2026"),
                new Qualification("NodeJs Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms19 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "Back-end development", "15/2/2024", "Completed"));
        Worker worker19 = new Worker(UUID.randomUUID().toString(), "John", qualifications19, trainingPrograms19, link);


        // 2
        List<Qualification> qualifications21 = Arrays.asList(new Qualification("MYSQL Certified", "2/07/2024"),
                new Qualification("Oracle Database Administration 2019 Certified Professional", "1/03/2026"));
        List<TrainingProgram> trainingPrograms21 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "Database design and optimization", "15/10/2025", "Not Started"),
                new TrainingProgram(UUID.randomUUID().toString(), "NoSQL databases", "15/12/2025", "Not Started"));
        Worker worker21 = new Worker(UUID.randomUUID().toString(), "Peter", qualifications21, trainingPrograms21, link);

        List<Qualification> qualifications22 = Arrays.asList(new Qualification("MYSQL Certified", "2/07/2024"),
                new Qualification("Oracle Database Administration 2019 Certified Professional", "1/03/2026"));
        List<TrainingProgram> trainingPrograms22 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(), "NoSQL databases", "15/12/2025", "Not Started"));
        Worker worker22 = new Worker(UUID.randomUUID().toString(), "Ira", qualifications22, trainingPrograms22, link);

        projects = Arrays.asList(new Project("100001", "WebDevelopment", Arrays.asList(worker11, worker12, worker13, worker14, worker15, worker16, worker17, worker18, worker19)),
                new Project("100002", "Database", Arrays.asList(worker21, worker22)));*/
    }

    public List<Worker> getWorkerDetailsForProjectId(String projectId, String qualificationName, String trainingProgramName) {

        Optional<Project> project = projectRepo.findById(Long.valueOf(projectId));
        if (project.isPresent()) {
            List<Worker> workerList = project.get().getWorkerList();
            List<Worker> filteredWorkers = workerList.stream()
                    .filter(w -> {
                                if (qualificationName != null && !qualificationName.isEmpty()) {
                                    return w.getQualificationList().stream().anyMatch(q -> q.getName().equals(qualificationName));
                                } else if (trainingProgramName != null && !trainingProgramName.isEmpty()) {
                                    return w.getTrainingProgramList().stream().anyMatch(t -> t.getProgramName().equals(trainingProgramName));
                                } else {
                                    return w.getTrainingProgramList().stream().anyMatch(t -> t.getStatus().equals("Completed"));
                                }
                            }
                    ).toList();
            return filteredWorkers;
        }
        return Collections.emptyList();
    }

    public Optional<Object> getWorkerDetailsForProjectIdAndWorkerId(String workerId) {
        List<Worker> workers = projectRepo.findAll().stream().flatMap(p -> p.getWorkerList().stream()).toList();
        return Optional.ofNullable(workers.stream().filter(w -> w.getWorkerId().equals(workerId)));
    }

    public List<Worker> getWorkers(String qualificationName, String trainingProgramName){
        if(qualificationName!=null && !qualificationName.isEmpty()) {
            if(trainingProgramName!=null && !trainingProgramName.isEmpty()) {{
                List<Worker> filteredList = workerRepo.findAll().stream().map(w -> new Worker(w, false, false)).toList();
                return filteredList;
            }}
            else {
                List<Worker> filteredList = workerRepo.findByQualification(qualificationName).stream().map(w -> new Worker(w, false, true)).toList();
                return filteredList;
            }
        }
        else  if(trainingProgramName!=null && !trainingProgramName.isEmpty()) {
            List<Worker> filteredList = workerRepo.findByTrainingProgramName(trainingProgramName).stream().map(w -> new Worker(w, true, false)).toList();
            return filteredList;
        }
        else{
            List<Worker> filteredList = workerRepo.findAll().stream().map(w -> new Worker(w, false, false)).toList();
            return filteredList;
        }
    }

}
