package com.project.coding_challenge_tasks.java8_handson_practice.midlevel_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find_the_Second_Highest_Salary_from_the_List_of_Employees
{

        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee("Anu", 101, 50000),
                    new Employee("David", 102, 75000),
                    new Employee("Steve", 103, 65000),
                    new Employee("Sam", 104, 60000)
            );

            Optional<Employee> secondHighest = employees.stream()
                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .skip(1)
                    .findFirst();

            secondHighest.ifPresent(System.out::println);
        }
    }

    class Emp {
        private String name;
        private int id;
        private int salary;

        public Emp(String name, int id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", salary=" + salary +
                    '}';
        }
    }

/*
      Step	What It Does
employees.stream()	Creates a stream of employees.
.sorted(Comparator.comparing(Employee::getSalary).reversed())	Sorts the employees in descending order of salary.
.skip(1)	Skips the first employee (highest salary).
.findFirst()	Picks the next employee (second highest salary).

Optional<Employee> is used in case the list has less than 2 elements, so it safely handles that case without throwing NullPointerException.
 */