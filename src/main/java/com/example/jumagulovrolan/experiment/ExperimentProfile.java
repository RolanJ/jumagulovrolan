package com.example.jumagulovrolan.experiment;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@ToString (exclude = "experiment")
@EqualsAndHashCode (exclude = "experiment")
public class ExperimentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne (mappedBy = "experimentProfile")
    @JsonBackReference
    private Experiment experiment;
}