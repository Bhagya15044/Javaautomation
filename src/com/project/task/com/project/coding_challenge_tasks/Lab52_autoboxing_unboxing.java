package com.project.coding_challenge_tasks;

public class Lab52_autoboxing_unboxing
{
    public static void main(String[] args)
    {
        // auto boxing means --> primitive data type to wrapper class conversion , get extra functionalities
        int a = 10;
        Integer b = a;
        System.out.println(b.toString());
        System.out.println(b.hashCode());
        System.out.println(b.doubleValue());
        System.out.println(b.longValue());

        // unboxing means --> wrapper class to primitive data types conversion, loose the extra functionalities
        Integer c = 11;
        int d = c;
        //System.out.println(d.); // here i am showing d. no extra functionalities available there
        System.out.println(d);
    }
}
/*
 In interviews, if asked:
"Why would we use autoboxing?"
You can say:
"Autoboxing allows primitives to be used in collections like ArrayList or to access utility methods from wrapper classes, giving more flexibility while keeping syntax simple."
 */