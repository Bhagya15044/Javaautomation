package com.project.coding_challenge_tasks;

public class Lab55_arithemetic_exception
{
    public static void main(String[] args)
    {
        int a =10;
        int b = 0 ;
        int c = 0;
        try
        {
            c = a/b;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
