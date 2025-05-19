package com.project.task6_if_condition;

public class Lab52_if_else_condition
{
    public static void main(String[] args)
    {
        int age = Integer.parseInt(args[0]); // here taking inputs from user

        if(age >= 18)
        {
            System.out.println("you can vote");
        }
        else
        {
            System.out.println("you can't vote");
        }
    }
}
