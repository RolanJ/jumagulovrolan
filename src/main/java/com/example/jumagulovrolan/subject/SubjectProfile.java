package com.example.jumagulovrolan.subject;


import com.example.jumagulovrolan.subject.Subject;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@ToString (exclude = "subject")
@EqualsAndHashCode (exclude = "subject")
public class SubjectProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne (mappedBy = "subjectProfile")
    @JsonBackReference
    private Subject subject;

}