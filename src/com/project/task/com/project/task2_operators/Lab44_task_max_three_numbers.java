package com.project.task2_operators;

public class Lab44_task_max_three_numbers
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 20;
        int z = 30;

        String result = (x > y )? ((x > z) ? "x ": "z") : ((y > z ) ? "x" : "z");
        System.out.println(result);
    }
}
