package com.project.task8_for_loop;

public class Lab84_for_loop_top_even_odd_numbers
{
    public static void main(String[] args)
    {
        for (int i = 1; i <=50; i++)
        {
            if(i%2==0)
            {
                System.out.println("even numbers --> "+ i);
            }
            else if (i%2!=0)
            {
                System.out.println("Odd numbers --> "+ i);
            }
            else
            {
                System.out.println("END");
            }
        }
    }
}
