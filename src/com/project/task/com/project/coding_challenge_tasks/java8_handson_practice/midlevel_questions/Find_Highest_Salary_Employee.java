package com.project.coding_challenge_tasks.java8_handson_practice.midlevel_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Find_Highest_Salary_Employee
{
    public static void main(String[] args)
    {
        List<HighestSalary> employees = Arrays.asList(
                new HighestSalary("Anu", 101, 50000),
                new HighestSalary("David", 102, 75000),
                new HighestSalary("Steve", 103, 65000));

        Optional<HighestSalary> highestPaid = employees.stream()
                .max(Comparator.comparing(HighestSalary::getSalary));

        highestPaid.ifPresent(System.out::println);
    }
}
class HighestSalary
{
    String name;
    int Id;
    int salary;

    public HighestSalary(String name, int id, int salary)
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
        return "HighestSalary{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", salary=" + salary +
                '}';
    }
}