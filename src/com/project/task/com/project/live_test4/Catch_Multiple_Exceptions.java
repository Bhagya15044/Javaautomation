package com.project.live_test4;

public class Catch_Multiple_Exceptions
{
    public static void main(String[] args)
    {
        String a = args[0]; // it will throw arrayboundsofoutexception if we do not pass the values
        int b = 10;
        int c = 0;
        try
        {
            int d = b/c; // it will throw the arthimetic exception
        }
        catch (ArithmeticException  | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
