package com.project.coding_challenge_tasks;

import java.util.Scanner;

public class Lab10_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score (0-100): ");


        // if user enter alphabet
        if(!scanner.hasNextInt())
        {
            System.out.println("Invalid input! Please enter integers only!.");
            return;
        }

        int score = scanner.nextInt();

        //if user enter negative intgers
        if (score < 0 || score > 100)
        {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
            return;
        }

        if (score >= 90) {
            System.out.println("Your grade is: A");
        } else if (score >= 80) {
            System.out.println("Your grade is: B");
        } else if (score >= 70) {
            System.out.println("Your grade is: C");
        } else if (score >= 60) {
            System.out.println("Your grade is: D");
        } else {
            System.out.println("Your grade is: F");
        }
    }
}
