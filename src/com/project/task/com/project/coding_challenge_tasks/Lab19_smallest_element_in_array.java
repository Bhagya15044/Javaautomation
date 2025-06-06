package com.project.coding_challenge_tasks;

import java.util.Scanner;

public class Lab19_smallest_element_in_array
{
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();

            int[] arr = new int[size]; //This array will hold the user's elements

            System.out.println("Enter " + size + " elements:");

            // below loop explanation
             //A for loop that runs from i = 0 to i = size-1.
            //In each iteration, it reads an integer from the user
            // and stores it at the ith position in the array arr.
            //This fills the entire array with user inputs.
            for (int i = 0; i < size; i++)
            {
                arr[i] = scanner.nextInt();
            }

            int smallest_element = arr[0]; // arr[0] to handle , negative numbers as well ,
            // if we assign only 0 , if we enter negative number then it will print 0 always

            for (int i = 1; i < arr.length ; i++)
            {
                if(arr[i]<smallest_element)
                {
                    smallest_element = arr[i];
                }
            }
            System.out.println("Smallest element in the array: "+smallest_element);
        }
    }

