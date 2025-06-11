package com.project.task16_oops_constructors;

public class Lab157_Main_this
{
    public static void main(String[] args)
    {
        Lab156_this_car C = new Lab156_this_car();
        System.out.println(C.Year);
        System.out.println(C.model);

        Lab156_this_car nano= new Lab156_this_car("nano" ,2011);
        // here what ever the value is given that will assign to attributes in this car class and replace this with nano.
        System.out.println(nano.model); // here nano will replace this and whatever the value is assigned here that will store in model_name, year_created
        System.out.println(nano.Year);

    }
}
