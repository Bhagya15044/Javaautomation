package com.project.task29_wrapper_class;

public class Lab213_wrapper_example2
{
    public static void main(String[] args)
    {
        // autoboxing--> converting primitive data types( int, float..) to wrapper class(Integer, Float) all this process can be done by jvm .
        int b = 12;
        Integer c = b;
       // System.out.println(b.); // no extra functionality available
        System.out.println(c.hashCode()); // we can no of extra functionalities


        // unboxing --> converting back of wrapper class to primitive data type.
        Integer ab = 34;
        int bc = ab;
        System.out.println(ab.floatValue()); // many functionality
       // System.out.println(bc.); no functionality
        System.out.println(bc);
    }
}
