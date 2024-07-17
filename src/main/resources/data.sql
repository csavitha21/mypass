INSERT INTO PROJECT (projectName) VALUES ('Project-1');
INSERT INTO PROJECT (projectName) VALUES ('Project-2');
INSERT INTO PROJECT (projectName) VALUES ('Project-3');
INSERT INTO PROJECT (projectName) VALUES ('Project-4');
INSERT INTO PROJECT (projectName) VALUES ('Project-5');

INSERT INTO Worker (workerName, projectId) VALUES ('worker-1', 1);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-2', 1);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-3', 2);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-4', 2);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-5', 3);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-6', 4);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-7', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-8', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-9', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-10', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-11', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-12', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-13', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-14', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-15', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-16', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-17', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-18', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-19', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-20', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-21', 5);
INSERT INTO Worker (workerName, projectId) VALUES ('worker-22', 5);


-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('AWS Certified', '2024-12-03', 1);
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Java Certified', '2026-12-07', 1);
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('NodeJs Certified', '2025-12-03', 1);

INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Front-end development', '2024-12-03', 'Completed', 1);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Back-end development', '2024-12-15', 'In-Progress', 1);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Oracle Database Administration 2019 Certified Professional', '2024-12-03', 2);
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 2);

INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Database design and optimization', '2025-10-15', 'Not Started', 2);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'In-Progress', 2);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('NodeJs Certified', '2025-03-15', 3);

INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Front-end development', '2024-12-03', 'In-Progress', 3);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Back-end development', '2024-06-15', 'Completed', 3);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('AWS Certified', '2024-12-03', 4);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Front-end development', '2024-12-03', 'Completed', 4);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Java Certified', '2026-12-07', 5);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Front-end development', '2024-12-03', 'Completed', 5);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Back-end development', '2024-12-15', 'In-Progress', 5);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Oracle Database Administration 2019 Certified Professional', '2024-12-03', 6);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Database design and optimization', '2025-10-15', 'Not Started', 6);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 7);
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Oracle Database Administration 2019 Certified Professional', '2024-12-03', 7);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'Completed', 7);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Database design and optimization', '2025-10-15', 'Completed', 7);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 8);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'Completed', 8);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Java Certified', '2024-12-03', 9);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Back-end development', '2024-12-15', 'Completed', 9);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 10);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'Completed', 10);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 11);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'Completed', 11);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 12);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'Completed', 12);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 13);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'Completed', 13);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Java Certified', '2024-12-03', 14);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Back-end development', '2024-12-15', 'Completed', 14);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 15);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'Completed', 15);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Java Certified', '2024-12-03', 16);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Back-end development', '2024-12-15', 'Not Started', 16);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 17);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'In-Progress', 17);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Java Certified', '2024-12-03', 18);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Back-end development', '2024-12-15', 'Completed', 18);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 19);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'Completed', 19);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Java Certified', '2024-12-03', 20);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Back-end development', '2024-12-15', 'Completed', 20);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('MYSQL Certified', '2024-12-03', 21);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('NoSQL databases', '2024-12-15', 'Completed', 21);

-----
INSERT INTO Qualification (qualificationName, expiryDate, workerId) VALUES ('Java Certified', '2024-12-03', 22);
INSERT INTO TrainingProgram (programName, completionDate, status, workerId) VALUES ('Back-end development', '2024-12-15', 'Completed', 22);