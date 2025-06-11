package com.project.task15_oops_part1;

public class Lab143_class_inside_class
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "bhagya";
        s1.age = 25;
        s1.study();
    }
}
class Student
{
    //attributes
    String name;
    int age;

    //behaviour
    void study(){};
}