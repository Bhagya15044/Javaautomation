package com.project_final_handson_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Filter_High_Salary_Employees
{
    public static void main(String[] args)
    {
        List<Employee> list = Arrays.asList(new Employee("Jhon",101,20000),
                new Employee("Mark",102,30000),
                new Employee("lilly",103,40000),
                new Employee("mikki",104,50000),
                new Employee("chikki",105,60000),
                new Employee("likki",106,70000));

        Optional<Employee> high_salary = list.stream().max(Comparator.comparing(Employee::getSalary));
        high_salary.ifPresent(System.out::println);
    }
}
class Employee
{
    String name;
    int Id;
    int salary;

    public Employee(String name, int id, int salary)
    {
        this.name = name;
        Id = id;
        this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", salary=" + salary +
                '}';
    }
}
/*
    If asked “How does Optional help here?”, you can say:

“Using Optional helps avoid NullPointerException.
 It makes it clear the result may be absent, and methods like ifPresent or orElse help handle such cases safely.”
 */