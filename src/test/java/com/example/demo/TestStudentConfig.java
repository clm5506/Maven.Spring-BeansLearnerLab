package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;


    @Test
    public void testCurrentStudents(){

        Assert.assertEquals(3,students.findAll().size());
    }

    @Test
    public void testPreviousStudents(){

        Assert.assertEquals(3,previousStudents.findAll().size());
    }
    @Test
    public void testCurrentStudentsFindById(){

        Student student1 = new Student(1L, "Cristina");

        Assert.assertEquals(student1.toString(),students.findById(1L).toString());
    }

    @Test
    public void testPreviousStudentsFindById(){

        Student previousStudent1 = new Student(4L, "Not Cristina");

        Assert.assertEquals(previousStudent1.toString(),previousStudents.findById(4L).toString());
    }

}
