package com.project.task16_oops_constructors;

public class Lab149_oops
{
    public static void main(String[] args)
    {
        baby b = new baby();
        new baby(); // this also an object , it will also call default constructor automatically
    }
}
class baby
{
    String name;

    public baby()
    {
        System.out.println(" I am a default constructor , I will be called automatically when object is created.");
    }
}