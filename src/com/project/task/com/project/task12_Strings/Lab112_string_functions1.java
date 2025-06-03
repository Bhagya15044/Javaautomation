package com.project.task12_Strings;

public class Lab112_string_functions1
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String ("Hello");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.concat(s3)); // will store in string constant pool
    }
}
