package com.project.task27_static_keyword;

public class Lab201_static_keyword
{
    public static void main(String[] args)
    {
        student s1 = new student(23);
        student s2 = new student(33);
        System.out.println(s1.age);
        System.out.println("------------------");
        System.out.println(s2.age);
        System.out.println("------------------");
        System.out.println(student.course_name); // it is same for both s1 and s2
        System.out.println(s1.course_name); // it is same for both s1 and s2
        System.out.println(s2.course_name); // it is same for both s1 and s2
        student.m1();
    }
}
class student
{
    int age; // non static, instance variable, attribute.
    static  String course_name = "ATB";

    public student(int age)
    {
        this.age = age;
    }
    static void m1()
    {
        System.out.println("I am a static method");
    }
}
