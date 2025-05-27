package com.project.task9_while_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab95_while_loop_guessing_game
{
    /*
         guess a number between 1 to 100
         number is 50
         guessed value is 80
     */

    public static void main(String[] args)
    {
          /*
               Logic building formula :
               ----------------------
               * step 1 : figure it out the input and output
               * step 2 : write a rough logic
               * step 3 : write a proper logic
               * step 4 : optimize
               * step 5 : edge cases
           */
        // to guess the random number from the user we can use this
        Random random = new Random();
        int num_to_guess = random.nextInt(100)+1; // it give give range from 1 to 100
        //System.out.println(num_to_guess);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");

        int guess;
        int attempts = 0;

        while (true)
        {
            guess = scanner.nextInt();
            attempts++;

            if (guess<num_to_guess)
            {
                System.out.println("too low try again!!!");
            }
            else if (guess>num_to_guess)
            {
                System.out.println("too high try again!!!");
            }
            else
            {
                System.out.println("you are right , Guessed in " + attempts +" attempts ");
                break;

            }
        }

    }
}
