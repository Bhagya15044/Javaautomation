package com.project.task11_functions;

public class Lab102_user_defined_one
{
    public static void main(String[] args)
    {
           int result = sum_of_two_numbers(4,5);
           System.out.println(result);

           int result1 = sum_of_two_numbers(4,15);
           System.out.println(result1);
    }

    static  int sum_of_two_numbers(int first, int second)
    {
        return first + second;
    }
}
