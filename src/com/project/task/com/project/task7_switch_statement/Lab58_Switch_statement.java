package com.project.task7_switch_statement;

import java.util.Scanner;

public class Lab58_Switch_statement
{
    /*
    Take user input and ask for the integer from 1 to 7
    if user enters integer from 1 to 7
     then tell which day it is from(mon to sun)
     */

    /*
        logic building :
        --------------
        step 1 --> use the scanner class to take the input from the user
        step 2 --> basically figuring out the expression and a day
        step 3 --> add  a rough logic
        step 4 --> fix the logic and optimize
        step 5 --> figure out the edge cases

        examples of edge cases are -->
          ***non integer input(string , flot values , " " etc.) ,
          ***overflow input(123777788000)
          ***no input/blank input( it means just press the enter button without typing any input)
     */
    /*
            This fix the fix for edge cases:
            ---------------------------------
            *use hasnext --> if user enter input ,
            *if that input matches from 1 to 7
            *then it will go into switch loop,
            *otherwise it will terminate there.
         */

    // break will terminate the loop, if we are not giving the break keyword , if expression matches the case , then it will go and print all the days
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day number (1 to 7):");

        if (scanner.hasNextInt())
        {
            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Please enter an integer between 1 and 7.");
            }
        }
        else
        {
            System.out.println("Invalid input. Please enter an integer value between 1 and 7.");
        }

        System.out.println("END OF THE PROGRAM");
    }
}
