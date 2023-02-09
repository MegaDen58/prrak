package com.example.demo111.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "age")
    private int age;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "name")
    private String name;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "surname")
    private String surname;
}
