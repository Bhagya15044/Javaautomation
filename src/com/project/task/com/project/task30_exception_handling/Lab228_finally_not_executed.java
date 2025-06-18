package com.project.task30_exception_handling;

public class Lab228_finally_not_executed
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10/10;
            System.out.println(a);
            System.exit(0); // it will stop to execute the finally block
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("I will be last");
        }
    }
}
