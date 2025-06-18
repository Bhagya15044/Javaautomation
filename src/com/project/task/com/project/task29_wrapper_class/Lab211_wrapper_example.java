package com.project.task29_wrapper_class;

public class Lab211_wrapper_example
{
    public static void main(String[] args)
    {
        int a = 10;
        //a. --->  // no function, no attribute available with the primitive data type.

        // char, short, byte,long,float,double --> we will avoid them now.--> it will not provide the extra functionality
        /*
             wrapper class --> it will give extra functionality(these are more advanced)
             Character, Integer, Byte, Short, Double, Long, Float
         */

        Integer a1 = 10;
        System.out.println(a1.doubleValue()); // here we can see many extra functionalities, inbuilt functions

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
