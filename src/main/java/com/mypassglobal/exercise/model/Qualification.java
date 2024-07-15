package com.mypassglobal.exercise.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private String Id;

    @Column(name = "qualificationName")
    private String qualificationName;

    @Column(name = "expiryDate")
    private String expiryDate;

    @ManyToOne
    @JoinColumn(name="workerId", nullable = false)
    @JsonBackReference
    private Worker worker;
}
