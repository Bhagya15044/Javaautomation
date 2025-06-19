package com.project.coding_challenge_tasks;

public class Lab33_Student_class_constructor
{
    public static void main(String[] args)
    {
       Student s = new Student("bhagya", 19);
    }
}
class Student
{
    String name;
    int age;

    Student (String name , int age)
    {
        this.name = name;
        this.age = age;
        this.display();
    }
    void display()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
