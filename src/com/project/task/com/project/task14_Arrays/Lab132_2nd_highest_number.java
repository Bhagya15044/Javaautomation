package com.project.task14_Arrays;

import java.util.Arrays;

public class Lab132_2nd_highest_number
{
    public static void main(String[] args)
    {
        int [] arr = {12,34,56,67,78,89,14,23,2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
