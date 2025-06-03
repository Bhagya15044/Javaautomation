package com.project.task12_Strings;

public class Lab109_String_functions
{
    public static void main(String[] args)
    {
        char ch = 'A';
        System.out.println(ch); // whenever we are trying to print character
        // it will print character only
        // not its ASCII value

        String s1 = "ABCD";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));
        System.out.println(s1.charAt(2));
    }
}
