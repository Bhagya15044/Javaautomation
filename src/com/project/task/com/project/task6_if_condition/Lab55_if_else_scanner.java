package com.project.task6_if_condition;

import java.util.Scanner;

public class Lab55_if_else_scanner
{
    public static void main(String[] args)
    {
        System.out.println("Enter your Age");
        Scanner scanner = new Scanner(System.in); // creating object for scanner class
        int age = scanner.nextInt(); // whatever the input given by the user that will assign to age.

        if (age>=18)
        {
            System.out.println("Allowed to vote");
        }
        else
        {
            System.out.println("Not Allowed to vote");
        }
    }
}
