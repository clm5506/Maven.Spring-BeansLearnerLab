package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlumni {

    @Autowired
    Alumni alumni;

    @Test
    public void testExecuteBootcamp(){

        Assert.assertEquals(1200,alumni.getPreviousStudents().findAll().get(0).getTotalStudyTime(),0.0);
    }


}
