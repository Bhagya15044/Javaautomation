package com.project.interviewing_java_chatgpt;

import java.util.Scanner;

public class Exception_handling
{
    public static void main(String[] args)// throws Exception
    {
        // taking input from the user
//        Scanner scanner= new Scanner(System.in);
//        System.out.println(" Enter the number");
//        int num = scanner.nextInt();

        // taking input using CLI(command line interface)
       // String number = args[0];

        int a = 10;
        int b = 0;
       // System.exit(0);
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
            System.out.println(" I will be executed always but , will not execute in scenario , when you guys use system.exit(0)");
        }

    }
}
