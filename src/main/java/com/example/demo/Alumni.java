package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {


    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @PostConstruct
    public void executeBootcamp(){
        for(Student student : previousStudents.findAll()){
            student.learn(1200);
        }
    }


    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public void setPreviousStudents(Students previousStudents) {
        this.previousStudents = previousStudents;
    }
}
