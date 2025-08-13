package com.project.java_hands_on_interview_chatgpt;

public class Question2_Single_inheritance
{
    public static void main(String[] args)
    {
        Manager m = new Manager();
        m.ManagerRecord();
        Employee e = new Employee();
        e.employee_record();

    }
}
class Manager
{
    public void ManagerRecord()
    {
        System.out.println("Manager salary");
    }
}
class Employee extends Manager
{
    @Override
    public void ManagerRecord()
    {
        System.out.println("Manager salary updated");
    }
    public void employee_record()
    {
        System.out.println("Employee salary");
    }
}
