package com.mypassglobal.exercise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

@Data
@AllArgsConstructor
public class TrainingProgram {

   /*  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    @JsonIgnore
    private String id;

   // @Column(name = "programName")
    private String programName;

   // @Column(name = "completionDate")
    private String completionDate;

    private String status;

}
