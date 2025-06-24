package com.project.task33_Collection_framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab249_ArrayList_class_element
{
    public static void main(String[] args)
    {
        Student s1 = new Student("bhagya", "25");
        Student s2 = new Student("kavya", "26");
        Student s3 = new Student("Divya", "23");

        List <Student> my_students = new ArrayList<>();
        my_students.add(s1);
        my_students.add(s2);
        my_students.add(s3);
        System.out.println(my_students);

        // if we want to print this details individually
        //s1.printDetails();
    }
}
class Student
{
    private  String name;
    private String roll_no;

    //parameterized constructor
    public Student(String name, String roll_no)
    {
        this.name = name;
        this.roll_no = roll_no;
    }

    //toString
    @Override
    public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", roll_no='" + roll_no + '\'' + '}';
    }

    //getter ans setter methods
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRoll_no()
    {
        return roll_no;
    }

    public void setRoll_no(String roll_no)
    {
        this.roll_no = roll_no;
    }
}
