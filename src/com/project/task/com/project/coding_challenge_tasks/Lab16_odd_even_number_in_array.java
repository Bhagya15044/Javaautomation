package com.project.coding_challenge_tasks;

import javax.swing.*;

public class Lab16_odd_even_number_in_array
{
    public static void main(String[] args)
    {
        int [] arr = {1, 2,3,4,5,6,7,8,9};

        for (int i = 0; i < arr.length ; i++)
        {
            if (arr[i]%2==0)
            {
                System.out.println("even numbers "+ arr[i]);
            }
            else
            {
                System.out.println("odd numbers "+ arr[i]);
            }
        }
    }
}
