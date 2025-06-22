package com.project.live_test2;

public class Test6_Employee_salary_calculation
{
    public static void main(String[] args)
    {
        Manager m = new Manager(60000,10000);
        System.out.println(m.base_Salary);
        System.out.println(m.bonus);
        System.out.println(m.salary_account);
        System.out.println("---------------");
        Developer d = new Developer(160,50);
        System.out.println(d.hours);
        System.out.println(d.hourly_rate);
        System.out.println(d.salary_account);
    }
}
class Employee_salary
{
    int base_Salary;
    int bonus;
    int hourly_rate;

}
class Manager extends Employee_salary
{
    int salary_account;
    public Manager(int base_Salary, int bonus)
    {
       this.base_Salary = base_Salary;
       this.bonus = bonus;
       salary_account = base_Salary + bonus;
       System.out.println("Total salary"+ salary_account);
    }

    public void setSalary_account(int salary_account)
    {
        this.salary_account = salary_account;
    }
}
class Developer extends Employee_salary
{
    int hours;
    int hourly_rate;
    int salary_account;

    public Developer( int hourly_rate, int hours)
    {
        this.hourly_rate = hourly_rate;
        this.hours = hours;
        salary_account = base_Salary * bonus;
        System.out.println("Total salary"+salary_account);
    }

    public void setSalary_account(int salary_account)
    {
        this.salary_account = salary_account;

    }
}