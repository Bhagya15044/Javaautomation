package com.project.coding_challenge_tasks;

import java.util.Scanner;

public class Lab1_switch_leap_year_month
{
    // possible edge case  is invalid month

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the year");
        System.out.println("Enter the Month");

        int year = scanner.nextInt();
        int month = scanner.nextInt();

        //if user enter invalid month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month entered. Please enter a month between 1 and 12.");
            return;  // Exit program early if invalid
        }

        // Calculate leap year once and store in a variable
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Print leap year or even/odd year info
        if (isLeapYear) {
            System.out.println("It is a leap year: " + year);
        } else if (year % 2 == 0) {
            System.out.println("Even year (not leap year): " + year);
        } else {
            System.out.println("Odd year (not leap year): " + year);
        }

        switch (month)
        {
            case 1 :
                System.out.println("January");
                System.out.println("31 days");
                break;

            case 2 :
                System.out.println("February");

                if (isLeapYear) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                };

                break;

            case 3 :
                System.out.println("March");
                System.out.println("31 days");
                break;

            case 4 :
                System.out.println("April");
                System.out.println("30 days");
                break;

            case 5 :
                System.out.println("May");
                System.out.println("31 days");
                break;

            case 6 :
                System.out.println("June");
                System.out.println("30 days");
                break;

            case 7 :
                System.out.println("July");
                System.out.println("31 days");
                break;

            case 8 :
                System.out.println("August");
                System.out.println("31 days");
                break;

            case 9 :
                System.out.println("September");
                System.out.println("30 days");
                break;

            case 10 :
                System.out.println("October");
                System.out.println("31 days");
                break;

            case 11 :
                System.out.println("November");
                System.out.println("30 days");
                break;

            case 12 :
                System.out.println("December");
                System.out.println("31 days");
                break;

            default:
                System.out.println("haha ): invalid month entered , you fool!");
        }

    }
}
