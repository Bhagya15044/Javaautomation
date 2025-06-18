package com.project.task30_exception_handling;

public class Lab223_Arithemetic_exception_example3
{
    // we can use Exception , Arithemetic Exception , Throwable in catch block, any of the three is possible to write
    public static void main(String[] args)
    {
        int a = 0;
        int b = 10;
        int c = 0;
        try
        {
            c = b/a;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
