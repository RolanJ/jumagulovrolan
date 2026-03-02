package com.example.jumagulovrolan.subject;

import com.example.jumagulovrolan.subject.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/subjects")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService service;

    @GetMapping
    public List<Subject> getAll(){
        return service.getAllSubjects();
    }
    @GetMapping("/{id}")
    public Subject getById(@PathVariable Long id){
        return service.getSubjectsById(id);
    }
    @PostMapping
    public Subject create(@RequestBody Subject subject){
        return service.createSubject(subject);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){ service.deleteSubject(id);}
}
