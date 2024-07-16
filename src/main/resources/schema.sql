DROP TABLE TrainingProgram IF EXISTS;
DROP TABLE Qualification IF EXISTS;
DROP TABLE Worker IF EXISTS;

CREATE TABLE IF NOT EXISTS TrainingProgram (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    programName VARCHAR(255),
    completionDate VARCHAR(255),
    status VARCHAR(255),
    workerId BIGINT
);

CREATE TABLE IF NOT EXISTS Qualification (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    qualificationName VARCHAR(255),
    expiryDate VARCHAR(255),
    workerId BIGINT
);

CREATE TABLE IF NOT EXISTS Worker (
    workerId BIGINT AUTO_INCREMENT PRIMARY KEY,
    workerName VARCHAR(255),
    qualificationId BIGINT,
    trainingId BIGINT,
    projectId BIGINT,
    FOREIGN KEY (qualificationId) REFERENCES Qualification(id),
    FOREIGN KEY (trainingId) REFERENCES TrainingProgram(id)
);

CREATE TABLE IF NOT EXISTS Project (
    projectId BIGINT AUTO_INCREMENT PRIMARY KEY,
    projectName VARCHAR(255),
    workerId BIGINT,
    FOREIGN KEY (workerId) REFERENCES Worker(workerId)
);