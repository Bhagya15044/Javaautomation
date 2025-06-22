package com.project.live_test2;

public class Test3_employee_encapsulation
{
    public static void main(String[] args)
    {
        Employee e = new Employee(1, "Jhon Doe",50000);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
class Employee
{
    private int id;
    private String name;
    private int salary;

    //parameterized constructor
    public Employee(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter and setter methods( to access the given attributes, we should generate getter setter , because attributes are declared in private)
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}