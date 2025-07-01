package com.project.java_hands_on_interview_chatgpt;

public class Question7_This_vs_Super_keyword_using_inheritance
{
    public static void main(String[] args)
    {
        Developer d = new Developer("Jhon",2,"Java automation testing");
        System.out.println(d.Emp_name);
        System.out.println(d.Emp_Id);
        System.out.println(d.Emp_Skill);
        d.showDetails();
    }
}
class EMPLOYEE
{
    String Emp_name;
    int Emp_Id;

    //parameterized constructor

    public EMPLOYEE(String emp_name, int emp_Id)
    {
        Emp_name = emp_name;
        Emp_Id = emp_Id;
    }

    public void showDetails()
    {
        System.out.println("employee name : " + Emp_name + "employee Id : " + Emp_Id) ;
    }
}
class  Developer extends EMPLOYEE
{

    String Emp_Skill;

    public Developer(String emp_name, int emp_Id, String emp_Skill) {
        super(emp_name, emp_Id);
        this.Emp_Skill = emp_Skill;
    }
    @Override
    public void showDetails()
    {
       System.out.println("employee name : " + Emp_name + "employee Id : " + Emp_Id + "Employee skill : "+ Emp_Skill);
    }
}