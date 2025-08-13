package com.project.coding_challenge_tasks.java8_handson_practice.midlevel_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_Employees_By_Salary_Desc
{

    public static void main(String[] args)
    {

        List<Employee> employeeList = Arrays.asList(new Employee("Anu",101 , 50000) , new Employee("David", 102, 75000),new Employee("steve", 103, 65000));
        List<Employee> sortedBySalaryDesc = employeeList.stream().sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
        System.out.println(sortedBySalaryDesc);
    }
}
class Employee
{
    String name;
    int Id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        Id = id;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}