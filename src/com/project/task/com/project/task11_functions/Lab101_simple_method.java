package com.project.task11_functions;

public class Lab101_simple_method
{
    public static void main(String[] args)
    {
        // void is non return type --> it will not return anything

        //int result = non_return_type(); // it will not return anything only printing

        non_return_type();

        int a = return_type();
        System.out.println(a);
    }

   // it will not return anything only printing
    static void non_return_type()
    {
        System.out.println("Hi, I will not return anything");
    }

    // it will return the particular data type(int, string , boolean, float , long , byte etc.)
    static int return_type()
    {
        System.out.println("Hi , whatever you will give , i will return to you");
        return 100;
    }
}
