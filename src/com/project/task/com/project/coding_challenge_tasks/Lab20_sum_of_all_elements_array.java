package com.project.coding_challenge_tasks;

import java.util.Scanner;

public class Lab20_sum_of_all_elements_array
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the elements you want : ");
        int elements = scanner.nextInt();
        int [] arr = new int[elements];
        int sum = 0;

        System.out.println("Now, enter " + elements + " elements one by one:");
        for (int i = 0; i < elements; i++)
        {
            arr[i] = scanner.nextInt();
        }

        for (int i =0; i < elements ; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("sum of elements in array :" +sum);
    }
}
