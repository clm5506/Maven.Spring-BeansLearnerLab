package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {


    //this ensures the Spring container registers the bean with the respective name.
    @Bean(name = "students")
    public Students currentStudents() {

        Student student1 = new Student(1L, "Cristina");
        Student student2 = new Student(2L, "Marci");
        Student student3 = new Student(3L, "Charles");

        List<Student> listStudents = new ArrayList<>();

        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        return new Students(listStudents);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {

        Student previousStudent1 = new Student(4L, "Not Cristina");
        Student previousStudent2 = new Student(5L, "Not Marci");
        Student previousStudent3 = new Student(6L, "Not Charles");

        List<Student> listStudents = new ArrayList<>();

        listStudents.add(previousStudent1);
        listStudents.add(previousStudent2);
        listStudents.add(previousStudent3);

        return new Students(listStudents);

    }


}
