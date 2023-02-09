package com.example.demo111.service.impl;

import com.example.demo111.dto.StudentDTO;
import com.example.demo111.repository.StudentRepository;
import com.example.demo111.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDTO> findAll() {
        List<StudentDTO> studentDTOs = new ArrayList<>();

        for(StudentDTO studentDTO : studentRepository.findAll()){
            studentDTOs.add(studentDTO);
        }

        return studentDTOs;
    }

    @Override
    public void create(StudentDTO studentDTO) {
        studentRepository.save(studentDTO);
    }

    @Override
    public StudentDTO findById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void update(StudentDTO studentDTO, int id) {
        StudentDTO updatedStudent = new StudentDTO();
        updatedStudent = findById(id);

        updatedStudent.setAge(studentDTO.getAge());
        updatedStudent.setName(studentDTO.getName());
        updatedStudent.setSurname(studentDTO.getSurname());

        studentRepository.save(updatedStudent);
    }

    @Override
    public void deleteById(int id) {

    }
}
