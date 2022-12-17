package com.example.school.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StudentDto {

    private Integer id;
    private String firstname;
    private String lastname;
    private Integer age;
    private LocalDateTime birth;
    private String phone;

}
