package com.example.demo111.service;

import com.example.demo111.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    List<StudentDTO> findAll();
    void create(StudentDTO studentDTO);
    StudentDTO findById(int id);
    void update(StudentDTO studentDTO, int id);
    void deleteById(int id);
}
