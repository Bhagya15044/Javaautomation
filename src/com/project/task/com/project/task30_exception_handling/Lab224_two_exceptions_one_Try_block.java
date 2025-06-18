package com.project.task30_exception_handling;

public class Lab224_two_exceptions_one_Try_block
{
    public static void main(String[] args)
    {
        int a = 0;
        int c = 0;
        try
        {
            c = 10/a;
            String s = null;
            s.trim();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
