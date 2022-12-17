package com.example.school.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity(name = ("teachers"))
@Table
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;
    private Integer age;
    private Boolean status;
    private LocalDate birth;
    private String phone;
    private String subject;
    private Integer expirience;
    private Double salary;
}

