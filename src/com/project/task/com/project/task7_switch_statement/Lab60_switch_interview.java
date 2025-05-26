package com.project.task7_switch_statement;

import java.util.Scanner;

public class Lab60_switch_interview
{
    /*
    if we give user input without matching the cases
    example if we 3 or some other number it will not print anything
    ,and also it will not give any error or exception

    output in console :
    ------------------

    Enter integers from 1 to 7
     10
    Process finished with exit code 0

     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers from 1 to 7");
        int day = scanner.nextInt();

        switch (day)
        {
            case 1 :
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
        }
    }
}
