package com.example.jumagulovrolan.scientist;

import com.example.jumagulovrolan.subject.SubjectRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ScientistService {
    private final ScientistRepository repository;
    private final SubjectRepository subjectrepository;

    public List<Scientist> getAllScientists() {
        return repository.findAll();
    }

    public Scientist getScientistsById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Scientist not found"));
    }

    @Transactional
    public Scientist createScientist(Scientist scientist) {
        if (scientist.getScientistProfile() != null) {
            scientist.getScientistProfile().setScientist(scientist);
        }
        return repository.save(scientist);
    }

    public void deleteScientist(Long id) {
        repository.deleteById(id);
    }
}
