package com.project.task15_oops_part1;

public class Lab145_Cat
{
    public static void main(String[] args)
    {
        Cat cat = new Cat(); // it is object creation
        Cat c1 = null; // it is just reference variable for null

        cat.name = "milky";
        cat.run();
       // c1.run(); //java.lang.NullPointerException
    }
}
class Cat
{
    String name ;

    void run()
    {
        System.out.println(" Hi I am milky ,I can run for 2 kms in a day");
    }
}