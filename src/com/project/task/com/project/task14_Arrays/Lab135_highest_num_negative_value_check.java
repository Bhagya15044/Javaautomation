package com.project.task14_Arrays;

public class Lab135_highest_num_negative_value_check
{
    public static void main(String[] args)
    {
        int [] arr = {12,34,-56,67,78,89,14,23,2};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

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
