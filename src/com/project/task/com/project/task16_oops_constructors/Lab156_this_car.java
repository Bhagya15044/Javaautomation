package com.project.task16_oops_constructors;

public class Lab156_this_car
{
    String model;
    int Year;

    Lab156_this_car()
    {
        model = "tesla 2025";
        Year = 2025;
        System.out.println("DC");
    }

    // another way to create the constructor using this keyword.
    Lab156_this_car(String model_name , int year_created)
    {
        this.model = model_name;
        this.Year = year_created;
    }
}
