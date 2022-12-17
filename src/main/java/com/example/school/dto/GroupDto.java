package com.example.school.dto;

import com.example.school.model.Student;
import com.example.school.model.Teacher;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupDto {
    private Integer id;
    private List<Student> students;
    private Teacher teacher;

}
