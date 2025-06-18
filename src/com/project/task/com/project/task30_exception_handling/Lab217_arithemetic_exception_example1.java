package com.project.task30_exception_handling;

public class Lab217_arithemetic_exception_example1
{
    public static void main(String[] args)
    {
        int a = 0;
        try
        {
            a = 10/0;
        }
        catch (Exception e)
        {
           // System.out.println("I am going to be executed whenever there is a problem in try , catch , which is line number 10");
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}
