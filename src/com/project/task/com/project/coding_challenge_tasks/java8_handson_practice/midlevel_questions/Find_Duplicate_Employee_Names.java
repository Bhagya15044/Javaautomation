package com.project.coding_challenge_tasks.java8_handson_practice.midlevel_questions;

import com.project.interviewing_java_chatgpt.Lab1_Method_overloading;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Find_Duplicate_Employee_Names
{
    public static void main(String[] args)
    {
        List<duplicate_names> namesList = Arrays.asList(new duplicate_names("Anu", 101, 50000),
                new duplicate_names("David", 102, 75000),
                new duplicate_names("Steve", 103, 65000),
                new duplicate_names("Anu", 104, 55000),
                new duplicate_names("David", 105, 60000));
       Map<String, Long> duplicateNames = namesList.stream().distinct().collect(Collectors.groupingBy(duplicate_names::getName,Collectors.counting()));
        List<String> duplicateName = duplicateNames.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Duplicate Names: " + duplicateNames);
    }
}
class duplicate_names
{
    String name;
    int Id;
    int Salary;

    public duplicate_names(String name, int id, int salary)
    {
        this.name = name;
        Id = id;
        Salary = salary;
    }

    public String getName()
    {
        return name;
    }
}
/*
.distinct() works on the entire object (needs equals() + hashCode()).

.groupingBy(..., Collectors.counting()) helps when you want to count how many times a key (like a name) appears.

After counting, you can filter count > 1 to get duplicates.
We're taking a Map of names and their counts.

Using .entrySet() to loop through each name and its count.

Filtering to keep only entries where count > 1.

Extracting just the name (getKey()).

Collecting them into a new list of duplicate names.
 */