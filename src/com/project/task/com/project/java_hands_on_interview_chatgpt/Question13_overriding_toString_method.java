package com.project.java_hands_on_interview_chatgpt;

public class Question13_overriding_toString_method
{
    public static void main(String[] args)
    {
        employer employee = new employer("jhon", 03,"QA");
        System.out.println(employee);
    }
}
class employer
{
    String name;
    int id;
    String department;

    // parameterized constructor

    public employer(String name, int id ,String department)
    {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // to string method

    @Override
    public String toString()
    {
        return "name='" + name + '\'' + ", id=" + id + ", department='" + department + '\'';
    }
}