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
public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUKInstructors")
    Instructors tcUKInstructors;

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Test
    public void testTcUsaInstructors(){
        Assert.assertEquals(3,tcUsaInstructors.findAll().size());
    }

    @Test
    public void testTcUKInstructors(){
        Assert.assertEquals(3,tcUKInstructors.findAll().size());
    }

    @Test
    public void testTcUsaInstructorsFindById(){
        Instructor instructor1 = new Instructor(1L, "Dolio");
        Assert.assertEquals(instructor1.toString(),tcUsaInstructors.findById(1L).toString());
    }

    @Test
    public void testTcUKInstructorsFindById(){
        Instructor instructor1 = new Instructor(4L, "Dolio");
        Assert.assertEquals(instructor1.toString(),tcUKInstructors.findById(4L).toString());
    }

    @Test
    public void testInstructors(){
        Assert.assertEquals(6,instructors.findAll().size());
    }
}
