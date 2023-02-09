package com.example.demo111.repository;

import com.example.demo111.dto.StudentDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<StudentDTO, Integer> {

}
