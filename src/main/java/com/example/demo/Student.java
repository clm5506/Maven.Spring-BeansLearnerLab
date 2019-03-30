package com.example.demo;

public class Student extends Person implements Learner{

    private double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

}
