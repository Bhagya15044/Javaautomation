package com.project.task12_Strings;

public class Lab111_interview_Qna
{
    public static void main(String[] args)
    {
        String s = "Hello";
        String s1 = "Hello";
        String s4 = "hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s==s2); // false because of different locations
        System.out.println(s3==s5); // false because both are present in object area ,
        // but in different location
        System.out.println(s==s1); // true because it is present in the scp

        // equals(check the characters in both string
        System.out.println(s.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}
//s,s1 --> that  new hello will point to old hello
//s2,s3 --> 2 hello will form

// == --> in case of string --> refers to location

/*
scp(string constant pool) --> when ever the string is created it will store
but it will not replace by other string until the garbage collector clean  ,
same string is created it will point to the existing string
 */

// object area(heap) --> always creates the new string