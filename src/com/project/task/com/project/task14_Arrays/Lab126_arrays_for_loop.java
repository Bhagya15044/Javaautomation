package com.project.task14_Arrays;

public class Lab126_arrays_for_loop
{
    public static void main(String[] args)
    {
        int [] marks = {12,14,54,23,67,34,87,92};
        System.out.println(marks.length);

        for (int i = 0; i< marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("--------");

        // enhanced for loop , only applicable in arrays
        for(int mark : marks)
        {
            System.out.println(mark);
        }
    }
}
