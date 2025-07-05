package com.project.live_test4;

import java.util.Scanner;

public class Try_Catch_Finally_Example
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 0;
        try
        {
            int c = a/b;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finally block always executes");
        }
    }
}
