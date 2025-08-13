package com.project.coding_challenge_tasks.java8_handson_practice.midlevel_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Group_Employees_By_Department
{
    public static void main(String[] args)
    {
        List<Department> list = Arrays.asList(new Department("Anu", 101, "HR"),
                new Department("David", 102, "IT"),
                new Department("Steve", 103, "Finance"),
                new Department("Sam", 104, "IT"),
                new Department("Amit", 105, "HR"));

        Map<String, List<String>> departmentList = list.stream().collect(Collectors.groupingBy(Department::getDepartment,Collectors.mapping(Department::getName,Collectors.toList())));
        departmentList.forEach((dep ,emp)-> {System.out.println(dep +"->"+ emp);});
        System.out.println(departmentList);
    }
}
class Department
{
    String name;
    int Id;
    String Department;

    public Department(String name, int id, String department)
    {
        this.name = name;
        Id = id;
        Department = department;
    }

    public String getDepartment()
    {
        return Department;
    }

    public String getName()
    {
        return name;
    }
}