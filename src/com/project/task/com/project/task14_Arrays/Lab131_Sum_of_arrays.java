package com.project.task14_Arrays;

public class Lab131_Sum_of_arrays
{
    public static void main(String[] args)
    {
        int [] arr = {12,33,51};
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
           sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
