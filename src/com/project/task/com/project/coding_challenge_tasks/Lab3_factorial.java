package com.project.coding_challenge_tasks;

import java.util.Scanner;

public class Lab3_factorial
{
    // possible edge case is negative integers

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int num= scanner.nextInt();

        // if user enter negative integers
        if(num<0)
        {
            System.out.println("enter values non negative integers");
            return;
        }
        int fact = 1;
        for(int i = 1 ; i<= num ; i++)
        {
            fact = fact*i;
        }
        System.out.println("factorial of " + num + " is " + fact);
    }

    /*
         Pattern is first it will check the number
         if it is greater than 0 , it will enter to for loop
         so i is 1 , i<=num , then it will go to fact = fact * i
         fact value is 1 , i value is also 1 , so fact * i ==> 1*1
         then i value go to for loop and update as i++ , now 1 value is 2, same i<=num
         fact*i => 1*2 = 2, same i value go for loop and it will update as 3,
         so like procedure continues upto 5
         then loop will terminate and print fact value

         i = 1 → fact = 1 * 1 = 1
         i = 2 → fact = 1 * 2 = 2
         i = 3 → fact = 2 * 3 = 6
         i = 4 → fact = 6 * 4 = 24
         i = 5 → fact = 24 * 5 = 120

         console output :
         --------------
          Enter the value
          -5
       enter values non negative integers
       factorial of -5 is 1

     */

}
