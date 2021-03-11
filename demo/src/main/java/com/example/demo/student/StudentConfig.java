package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student student1 = new Student(1L, "test",  "test@gamilc.o", LocalDate.of(2003, Month.APRIL, 3));
            Student student2 = new Student( "test1",  "test1@gamilc.o", LocalDate.of(2008, Month.APRIL, 23));
            Student student3 = new Student( "test2",  "test2@gamilc.o", LocalDate.of(2010, Month.APRIL, 23));

            repository.saveAll(List.of(student1, student2, student3));


        };
    }
}
