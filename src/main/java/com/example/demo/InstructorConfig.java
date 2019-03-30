package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorConfig {

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors(){
        Instructor instructor1 = new Instructor(1L, "Dolio");
        Instructor instructor2 = new Instructor(2L, "Leon");
        Instructor instructor3 = new Instructor(3L, "Kris");

        List<Instructor> listInstructors = new ArrayList<>();

        listInstructors.add(instructor1);
        listInstructors.add(instructor2);
        listInstructors.add(instructor3);
        return new Instructors(listInstructors);
    }

    @Bean(name = "tcUKInstructors")
    public Instructors tcUKInstructors(){
        Instructor instructor1 = new Instructor(4L, "Dolio");
        Instructor instructor2 = new Instructor(5L, "Leon");
        Instructor instructor3 = new Instructor(6L, "Kris");

        List<Instructor> listUKInstructors = new ArrayList<>();

        listUKInstructors.add(instructor1);
        listUKInstructors.add(instructor2);
        listUKInstructors.add(instructor3);
        return new Instructors(listUKInstructors);
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors(){
        List<Instructor> merged = new ArrayList<>();
        merged.addAll(tcUKInstructors().findAll());
        merged.addAll(tcUsaInstructors().findAll());
        return new Instructors(merged);
    }



}
