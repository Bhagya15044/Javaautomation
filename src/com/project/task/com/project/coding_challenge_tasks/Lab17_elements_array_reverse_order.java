package com.project.coding_challenge_tasks;

public class Lab17_elements_array_reverse_order
{
    public static void main(String[] args)
    {
        int [] arr = {1, 2 , 3, 4, 5, 6};

        for (int i = arr.length-1; i >= 0; i--)
        {
            System.out.print(arr[i]);
        }
    }
}
