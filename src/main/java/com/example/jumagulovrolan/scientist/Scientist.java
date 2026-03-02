package com.example.jumagulovrolan.scientist;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"scientistProfile", "subject"})
@EqualsAndHashCode(exclude = {"scientistProfile", "subject"})
public class Scientist {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private ScientistProfile scientistProfile;
}
