package com.project.task2_operators;

public class Lab28_instance_of_operator
{
    // instance of operator is used to check the data type and give result as boolean value.
    public static void main(String[] args)
    {
        String x = new String("hi welcome to java automation testing");
        int a = 10;
        System.out.println( x instanceof String); // result is true
        System.out.println(a);
       // System.out.println( a instanceof String); int is not suitable to instanceof
    }
}
