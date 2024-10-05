package com.example.api;

import org.testng.annotations.Test;

public class prority {
    @Test(priority = 1)
    public  void sampleOne(){
        System.out.println("Sample One test method");
    }
    @Test(priority = 2)
    public  void sampleTwo(){
        System.out.println("Sample Two test method");
    }
    @Test(priority = 3)
    public  void sampleThree(){
        System.out.println("Sample Three test method");

    }
    @Test(priority = 4)
    public  void sampleFour(){
        System.out.println("Sample Four test method");

    }
    @Test (priority = 5)
    public  void sampleFive(){
        System.out.println("Sample Five test method");
    }



}
