package com.mypassglobal.exercise.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@ToString
public class TrainingProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private String id;

    @Column(name = "programName")
    private String programName;

    @Column(name = "completionDate")
    private Date completionDate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "workerId", nullable = false)
    @JsonBackReference
    private Worker worker;

}
