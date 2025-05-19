package com.project.task3_typecasting;

public class Lab36_Typecasting_narrowing
{
    public static void main(String[] args)
    {
        int value = 300;
        //byte b = value; // implicit narrowing , asked by programmer to tell jvm to do it , but it will data loss will be there.
        byte b1 = (byte)value; // explicit narrowing , Data loss is there .
        System.out.println(b1);

    }
}
