package com.project.task30_exception_handling;

public class Lab215_exception
{
    public static void main(String[] args)
    {
        System.out.println("start the program");
        String input = args[0]; // this input can be taken by the CLI(command line interface)
        int a = Integer.parseInt(input); // string to integer conversion
        int b = 100/a;
        System.out.println(b);
        System.out.println("End of the program");

        /*
             1. if we don't pass any input -->ArrayIndexOutOfBoundsException
             2. if we pass 0 --> ArithmeticException
             3. if we pass string (example : Bhagya) --> NumberFormatException
         */
    }
}
