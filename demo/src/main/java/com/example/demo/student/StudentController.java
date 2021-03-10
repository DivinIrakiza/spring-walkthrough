package com.example.demo.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Divin", "Irakiza", LocalDate.of(2000, Month.APRIL, 4), 3)
        );
    }
}
