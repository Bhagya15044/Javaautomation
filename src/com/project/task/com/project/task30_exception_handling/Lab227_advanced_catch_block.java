package com.project.task30_exception_handling;

public class Lab227_advanced_catch_block
{
    public static void main(String[] args)
    {
        try
        {
            String input = args[0]; // this input can be taken by the CLI(command line interface)
            int a = Integer.parseInt(input); // string to integer conversion
            int b = 0;
            b = 100/a;
            System.out.println(b);
        }
        catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());;
        }
        finally
        {
            System.out.println("I will be always called");
        }
    }
}
