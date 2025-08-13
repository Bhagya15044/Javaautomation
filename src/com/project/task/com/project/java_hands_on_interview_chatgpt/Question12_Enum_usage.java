package com.project.java_hands_on_interview_chatgpt;

import java.util.Scanner;

public class Question12_Enum_usage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (1 to 7):");
        int input = sc.nextInt();

        // Validate the input
        if (input < 1 || input > 7)
        {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
            return;
        }

        // Convert input to enum
        Day day = Day.values()[input - 1];

        // Working day or weekend
        if (day == Day.SATURDAY || day == Day.SUNDAY)
        {
            System.out.println("It's a weekend: " + day);
        }
        else
        {
            System.out.println("It's a working day: " + day);
        }

        // Print full name of the day using switch
        switch (day)
        {
            case MONDAY:
                System.out.println("You selected: Monday");
                break;
            case TUESDAY:
                System.out.println("You selected: Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("You selected: Wednesday");
                break;
            case THURSDAY:
                System.out.println("You selected: Thursday");
                break;
            case FRIDAY:
                System.out.println("You selected: Friday");
                break;
            case SATURDAY:
                System.out.println("You selected: Saturday");
                break;
            case SUNDAY:
                System.out.println("You selected: Sunday");
                break;
        }
    }
}

// Enum with uppercase names for better convention
enum Day
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
