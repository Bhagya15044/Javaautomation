package com.project.task30_exception_handling;

import java.util.Scanner;

public class Lab226_finally_usage
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int V  = scanner.nextInt();
        try
        {
            int v = 10/0;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            scanner.close();
        }
    }
}
