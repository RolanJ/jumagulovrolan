package com.example.jumagulovrolan.subject;

import com.example.jumagulovrolan.subject.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {
    private final SubjectRepository repository;

    public List<Subject> getAllSubjects() {
        return repository.findAll();
    }

    public Subject getSubjectsById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Subject not found"));
    }

    @Transactional
    public Subject createSubject(Subject subject) {
        if (subject.getSubjectProfile() != null) {
            subject.getSubjectProfile().setSubject(subject);
        }
        return repository.save(subject);
    }

    public void deleteSubject(Long id) {
        repository.deleteById(id);
    }
}
