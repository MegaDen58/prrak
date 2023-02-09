package com.example.demo111.controller;

import com.example.demo111.dto.StudentDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    List<StudentDTO> getAll(){
        return Collections.emptyList();
    }

    @PostMapping
    void create(@RequestBody StudentDTO studentDTO){

    }

    @PutMapping("/{id}")
    void update(@PathVariable int id, @RequestBody StudentDTO studentDTO){

    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable int id){

    }
}
