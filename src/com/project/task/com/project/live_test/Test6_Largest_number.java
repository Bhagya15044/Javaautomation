package com.project.live_test;

import java.util.Scanner;

public class Test6_Largest_number
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int largest_element = arr[0]; // arr[0] to handle , negative numbers as well ,
        // if we assign only 0 , if we enter negative number then it will print 0 always

        for (int i = 1; i < arr.length ; i++)
        {
            if(arr[i]>largest_element)
            {
                largest_element = arr[i];
            }
        }
        System.out.println("largest element in the array: " +largest_element);
    }
}

