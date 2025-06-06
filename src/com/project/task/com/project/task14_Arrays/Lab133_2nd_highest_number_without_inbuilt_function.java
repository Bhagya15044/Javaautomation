package com.project.task14_Arrays;

public class Lab133_2nd_highest_number_without_inbuilt_function
{
    public static void main(String[] args)
    {
        int [] arr = {12,34,56,67,78,89,14,23,2};
        int highest = 0;
        int secondHighest = 0;

        for(int num : arr)
        {
            if(num>highest)
            {
                secondHighest = highest;
                highest = num;
            }
            else if (num>secondHighest && num!=highest)
            {
                secondHighest = num;
            }
        }
        System.out.println(secondHighest);
    }
}
