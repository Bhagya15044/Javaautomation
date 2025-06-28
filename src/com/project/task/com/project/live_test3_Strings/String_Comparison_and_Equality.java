package com.project.live_test3_Strings;

public class String_Comparison_and_Equality
{
    public static void main(String[] args)
    {
        String a = "Hello";
        String b = "hello";
        String c = "Hello";
        System.out.println(b.equals(c));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.compareTo(b));
    }
}
