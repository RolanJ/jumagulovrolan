package com.example.jumagulovrolan.scientist;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Data
@ToString (exclude = "scientist")
@EqualsAndHashCode (exclude = "scientist")
public class ScientistProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private LocalDate birthday;

    @OneToOne (mappedBy = "scientistProfile")
    @JsonBackReference
    private Scientist scientist;

}
