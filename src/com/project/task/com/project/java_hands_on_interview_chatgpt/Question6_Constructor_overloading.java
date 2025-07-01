package com.project.java_hands_on_interview_chatgpt;

public class Question6_Constructor_overloading
{
    public static void main(String[] args)
    {
        Student s = new Student();
        System.out.println(s.name); // empty string provides null value(it is default value for null)
        System.out.println(s.age); // empty int provides 0( it is default value for int)
        System.out.println(s.marks);
        s.display();
        System.out.println("----------------------");
        Student s1 = new Student("Jhon", 18);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks);
        s1.display();
        System.out.println("-----------------------");
        Student s2 = new Student("mark", 23,89);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.marks);
        s2.display();
    }
}
class Student
{
    String name;
    int age;
    int marks;

    //default constructor

    public Student()
    {

    }

    //parameterized constructor 1

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // parameterized constructor 2

    public Student(String name, int age, int marks)
    {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void display()
    {
        System.out.println("Name : " + name + "Age : " + age + "Marks : " + marks);
    }
}