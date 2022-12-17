package com.example.school.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TeacherDto {

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
