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
public class TestClassroomConfig {

    @Autowired
    @Qualifier("classroom")
    Classroom classroom;

    @Test
    public void testClassroomNumOfInstructors(){
       int numOfInstructors = classroom.getInstructors().findAll().size();
        Assert.assertEquals(6,numOfInstructors);
    }

    @Test
    public void testClassroomNumOfStudents(){
        int numOfStudents= classroom.getStudents().findAll().size();
        Assert.assertEquals(3,numOfStudents);
    }
}
