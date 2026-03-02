package com.example.jumagulovrolan.scientist;

import com.example.jumagulovrolan.scientist.Scientist;
import com.example.jumagulovrolan.scientist.ScientistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/scientist")
@RequiredArgsConstructor
public class ScientistController {
    private final ScientistService service;

    @GetMapping
    public List<Scientist> getAll(){
        return service.getAllScientists();
    }
    @GetMapping("/{id}")
    public Scientist getById(@PathVariable Long id){
        return service.getScientistsById(id);
    }
    @PostMapping
    public Scientist create(@RequestBody Scientist scientist){
        return service.createScientist(scientist);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){ service.deleteScientist(id);}
}
