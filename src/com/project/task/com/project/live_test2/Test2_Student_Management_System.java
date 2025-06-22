package com.project.live_test2;

public class Test2_Student_Management_System
{
    public static void main(String[] args)
    {
          Student s = new Student("Bob", 101,"A");
          System.out.println(s.name );
          System.out.println(s.roll_no );
          System.out.println(s.section);
    }
}
class Student
{
    String name;
    int roll_no;
    String section;

    public Student(String name, int roll_no, String section)
    {
        this.name = name;
        this.roll_no = roll_no;
        this.section = section;
    }

    public void test()
    {
        System.out.println("Name : "+ name +  "Roll_no : " + roll_no + "Section :"+section);
    }
}