package com.project.coding_challenge_tasks;

import java.util.Scanner;

public class Lab2_kids_grade_switch_statement
{
    /*
         possible edge cases
         *multiple characters
         *blank input  (input.isempty)
         * non char values
         *lower case
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter type of grade");

        String input = scanner.nextLine().trim(); // scanner.nextline reads whole input and trim extra spaces

        // if blank space entered by user
        if (input.isEmpty()) {
            System.out.println("Grade cannot be blank.");
            return;
        }

        //multiple characters entered by the user
        if (input.length() != 1) {
            System.out.println("Please enter a single character grade (A-F).");
            return;
        }

        char grade = Character.toUpperCase(input.charAt(0)); // ready input will convert into uppercase



        switch (grade)
        {
            case 'A' :
                System.out.println("Excellent , 90 -100% scored");
                break;

            case 'B' :
                System.out.println("Very good , 80 - 89% scored");
                break;

            case 'C' :
                System.out.println("Good , 70 -79% scored");
                break;

            case 'D' :
                System.out.println("Needs improvement , 60 -69% scored");
                break;

            case 'E' :
                System.out.println("Poor , below 50% scored");
                break;

            case 'F' :
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid grade entered");
        }
    }
}
