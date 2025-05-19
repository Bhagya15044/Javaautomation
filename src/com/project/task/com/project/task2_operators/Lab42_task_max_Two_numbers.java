package com.project.task2_operators;

public class Lab42_task_max_Two_numbers
{
    public static void main(String[] args)
    {
        int x= 10;
        int y = 20;
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));

        int max = x>y ? x :y;
        int min = x<y ? x :y;
        System.out.println(max);
        System.out.println(min);

    }

}
