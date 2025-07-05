package com.project.live_test4;

public class Autoboxing_and_Unboxing_Example
{
    public static void main(String[] args)
    {
        // autoboxing --> converting primitive data types to wrapper classes
        int a = 10;
       // System.out.println(a.); // no extra functionalities available
        System.out.println(a);
        Integer b = a;
        System.out.println(b.hashCode());
        System.out.println(b.longValue());
        System.out.println(b.equals(a));

        // unboxing --> converting back the wrapper classes into primitive data types

        int c = b;
        //System.out.println(c.); loosing of the extra functionalities
        System.out.println(c);
    }
}
