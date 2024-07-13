/*
import com.mypassglobal.exercise.model.Project;
import com.mypassglobal.exercise.model.Qualification;
import com.mypassglobal.exercise.model.TrainingProgram;
import com.mypassglobal.exercise.model.Worker;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class Main {
    */
/*public static void main(String[] args) {
        // Example data setup
        Qualification q1 = new Qualification("Java Certification", "complete");
        Qualification q2 = new Qualification("Python Certification", "in-progress");

        Training t1 = new Training("Agile Training", "complete");
        Training t2 = new Training("Scrum Master Certification", "in-progress");

        Worker worker1 = new Worker("Alice", Arrays.asList(q1, q2), Arrays.asList(t1));
        Worker worker2 = new Worker("Bob", Arrays.asList(q1), Arrays.asList(t1, t2));
        Worker worker3 = new Worker("Charlie", Arrays.asList(q2), Arrays.asList(t2));

        List<Worker> workers = Arrays.asList(worker1, worker2, worker3);

        List<Worker> filteredWorkers = filterWorkersByQualificationOrTraining(workers);

        // Displaying the filtered workers
        System.out.println("Filtered Workers:");
        filteredWorkers.forEach(worker -> {
            System.out.println("Worker: " + worker.getName());
            System.out.println("Qualifications:");
            worker.getQualifications().forEach(q -> System.out.println("- " + q.getName() + " (" + q.getStatus() + ")"));
            System.out.println("Trainings:");
            worker.getTrainings().forEach(t -> System.out.println("- " + t.getName() + " (" + t.getStatus() + ")"));
            System.out.println("---------------");
        });
    }*//*


    public static void main(String[] args) {
        List<Project> projects;
        List<Qualification> qualifications11 = Arrays.asList(new Qualification("AWS Certified", "12/07/2023"),
                new Qualification("Java Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms11 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(),"Front-end development", "15/03/2024", "Completed"),
                new TrainingProgram(UUID.randomUUID().toString(),"Back-end development", "15/12/2024", "In-Progress"));
        Worker worker11 = new Worker(UUID.randomUUID().toString(), "Sam", qualifications11, trainingPrograms11);

        List<Qualification> qualifications12 = Arrays.asList(new Qualification("AWS Certified", "12/01/2025"),
                new Qualification("NodeJs Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms12 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(),"Back-end development", "15/12/2024", "In-Progress"));
        Worker worker12 = new Worker(UUID.randomUUID().toString(), "Paul", qualifications12, trainingPrograms12);


        List<Qualification> qualifications13 = Arrays.asList(new Qualification("Java Certified", "12/07/2026"),
                new Qualification("NodeJs Certified", "12/07/2026"));
        List<TrainingProgram> trainingPrograms13 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(),"Back-end development", "15/2/2024", "Completed"));
        Worker worker13 = new Worker(UUID.randomUUID().toString(), "John", qualifications13, trainingPrograms13);


        // 2
        List<Qualification> qualifications21 = Arrays.asList(new Qualification("MYSQL Certified", "2/07/2024"),
                new Qualification("Oracle Database Administration 2019 Certified Professional", "1/03/2026"));
        List<TrainingProgram> trainingPrograms21 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(),"Database design and optimization", "15/10/2025", "Not Started"),
                new TrainingProgram(UUID.randomUUID().toString(),"NoSQL databases", "15/12/2025", "Not Started"));
        Worker worker21 = new Worker(UUID.randomUUID().toString(), "Peter", qualifications21, trainingPrograms21);

        List<Qualification> qualifications22 = Arrays.asList(new Qualification("MYSQL Certified", "2/07/2024"),
                new Qualification("Oracle Database Administration 2019 Certified Professional", "1/03/2026"));
        List<TrainingProgram> trainingPrograms22 = Arrays.asList(new TrainingProgram(UUID.randomUUID().toString(),"NoSQL databases", "15/12/2025", "Not Started"));
        Worker worker22 = new Worker(UUID.randomUUID().toString(), "Ira", qualifications22, trainingPrograms22);

        projects = Arrays.asList(new Project("100001", "WebDevelopment", Arrays.asList(worker11, worker12, worker13)),
                new Project("100002", "Database", Arrays.asList(worker21, worker22)));

        Optional<Project> project = projects.stream().filter(p ->p.getProjectID().equals("100001")).findFirst();
        List<Worker> workerList = project.get().getWorkerList();
        List<Worker> filtered = workerList.stream()
                .filter(w ->
                        w.getTrainingPrograms().stream().allMatch(t->t.getProgramName().equals("Back-end development"))
                ).toList();

        List<Worker> filtered1 = workerList.stream()
                .filter(w ->

                ).toList();

        filtered.forEach(worker -> {
            System.out.println("Worker: " + worker.getWorkerName());
            System.out.println("Qualifications:");
            worker.getQualifications().forEach(q -> System.out.println("- " + q.getQualificationName()+ ")"));
            System.out.println("Trainings:");
            worker.getTrainingPrograms().forEach(t -> System.out.println("- " + t.getProgramName() + " (" + t.getStatus() + ")"));
            System.out.println("---------------");
        });

    }
    }

    */
/*public static List<Worker> filterWorkersByQualificationOrTraining(List<Worker> workers) {
        return workers.stream()
                .filter(worker ->
                        worker.getQualifications().stream().anyMatch(q -> q.getStatus().equals("complete"))
                                || worker.getTrainings().stream().anyMatch(t -> t.getStatus().equals("complete"))
                )
                .collect(Collectors.toList());
    }*//*


*/
/*
class Qualification {
    private String name;
    private String status;

    // Constructor, getters, setters
    public Qualification(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}

 class Training {
    private String name;
    private String status;

    // Constructor, getters, setters
    public Training(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}

 class Worker {
    private String name;
    private List<Qualification> qualifications;
    private List<Training> trainings;

    // Constructor, getters, setters
    public Worker(String name, List<Qualification> qualifications, List<Training> trainings) {
        this.name = name;
        this.qualifications = qualifications;
        this.trainings = trainings;
    }

    public String getName() {
        return name;
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public List<Training> getTrainings() {
        return trainings;
    }
}*/

