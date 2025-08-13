package com.project.coding_challenge_tasks.java8_handson_practice.random;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class optional_usage
{
    public static void main(String[] args)
    {
        List<Employee> list = Arrays.asList(new Employee("jhon",101,25000),
                new Employee("Mark",102,30000),
                new Employee("mikki",103,40000));

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