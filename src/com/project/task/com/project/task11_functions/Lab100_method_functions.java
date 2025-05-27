package com.project.task11_functions;

public class Lab100_method_functions
{
    public static void main(String[] args)
    {
        //step : 2 --> calling
        name_of_the_function(); // if we created a method out side of the main method ,
        // if it is static if we call the function in main method
        // then printing will happen

    }
    //step : 1 --> definition
   static void name_of_the_function() // written this method outside of main method
    {
        System.out.println("Hi");
    }
}
