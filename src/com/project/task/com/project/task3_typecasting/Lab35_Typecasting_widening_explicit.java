package com.project.task3_typecasting;

public class Lab35_Typecasting_widening_explicit
{
    public static void main(String[] args)
    {
        byte a= 10;
        int b = a; // implicit casting , done automatically by java compiler
        int b1= (int) a; // explicit casting , done by the programmer
        // In case of widening explicit casting is optional.
        System.out.println(b1);

    }
}
