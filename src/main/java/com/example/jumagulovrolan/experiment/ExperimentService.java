package com.example.jumagulovrolan.experiment;

import com.example.jumagulovrolan.scientist.ScientistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExperimentService {
    private final ExperimentRepository repository;

    public List<Experiment> getAllExperiments(){
        return repository.findAll();
    }

}
