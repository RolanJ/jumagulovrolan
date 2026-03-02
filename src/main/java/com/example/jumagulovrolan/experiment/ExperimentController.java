package com.example.jumagulovrolan.experiment;


import com.example.jumagulovrolan.scientist.*;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/experiment")
@RequiredArgsConstructor
public class ExperimentController {
    private final ExperimentService service;

    @GetMapping
    public List<Experiment> getAll(){
        return service.getAllExperiments();
    }

}
