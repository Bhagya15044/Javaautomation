package com.project.task8_for_loop;

public class Lab83_for_loop_greater_vs_equal
{
    public static void main(String[] args)
    {
        for( int i = 0 ; i <= 10; i++)
        {
            System.out.println(i);
            // guess output : printing 11 times , but i values will be 0 to 10
        }

        for( int i = 1 ; i <=10; i++)
        {
            System.out.println(i);
            //Guess output : printing 10 times , i values are from 1 to 10
        }

        for( int i = 0 ; i < 10; i++)
        {
            System.out.println(i);
            //Guess output : printing 10 times , i values are from 0 to 9
        }
    }
}
