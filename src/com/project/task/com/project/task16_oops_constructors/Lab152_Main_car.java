package com.project.task16_oops_constructors;

public class Lab152_Main_car
{
    public static void main(String[] args)
    {
        Lab151_car tesla = new Lab151_car();
        tesla.name = "tesla model 3";
        tesla.Year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.Year);
        System.out.println(tesla.Model); //here we did set any value for model
        // the values come from the default constructor created in class car.

        System.out.println("--------------------------");

        Lab151_car nano = new Lab151_car();
        nano.name = "Tata nano";
        System.out.println(nano.name);
        System.out.println(nano.Year); //here we did set any value for year, model
        // the values come from the default constructor created in class car.
        System.out.println(nano.Model);
    }
}
