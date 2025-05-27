package com.project.task9_while_loop;

import java.util.Scanner;

public class Lab94_while_loop_in_qn_factorial
{
    public static void main(String[] args)
    {
        /*
            Logic building formula :
            -----------------------
            * step 1 : figure out the data type for input and ouput
            * step 2 : write a rough logic
            * step 3 : write a proper logic for this
            * step 4 : optimize
            * step 5 : edge cases
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to factorial program");
        System.out.println("Enter the number whose you want for factorial");

        // to check if user entered the integer or not.
        if(!scanner.hasNextInt())
        {
            System.out.println("Enter the Integer value , and Re-Run the program" );
        }

        int number = scanner.nextInt();
        int fact = 1;

        // if number is less than/equal to zero then it will print factorial is 1
        if(number<=0)
        {
            System.out.println("Factorial is " + fact);
        }

        // if user enter above max value of integer
        if(number>Integer.MAX_VALUE)
        {
            System.out.println("Can't get the factorial as out of bound");
        }

        int i = 1;

        /*
         i value is always less or equal to the number which is entered by the user
         then it will enter into the loop
         */
        while (i<=number)
        {
            fact = fact*i;
            i++;
        }
        System.out.println("factorial is --> " + fact);
    }

}
