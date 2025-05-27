package com.project.task11_functions;

import java.util.Scanner;

public class Lab105_Arithemetic_function
{
    public static void main(String[] args)
    {
        /*
        create a function like sum, sub, mul div
        take user input using scanner class.

        Logic building formula:
        ----------------------
        step 1 : figure the input and output
                 take input--> int-->scanner class
                 variable result (a,b)--> int

        step 2 : write a rough logic
                 use type 4th method with parameters, with return type

        step 3 : write the code and fix it.
        step 4 : edge cases
    */

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner , "Enter the First Number");
        int b = readInt(scanner , "Enter the Second Number");

        int result_sum = sum(a,b);
        int result_sub=  sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);

    }

    // this is to check whether the user entered the integer or not
    static int readInt(Scanner scanner , String value)
    {
        System.out.println(value);
        if(scanner.hasNextInt())
        {
            return scanner.nextInt();
        }
        else
        {
            System.out.println("Enter integer only");
            System.exit(0);
            return -1; // unreachable , required for compilation
        }
    }

    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int div(int a, int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
    }
}
