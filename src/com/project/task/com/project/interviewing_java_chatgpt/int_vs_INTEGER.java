package com.project.interviewing_java_chatgpt;

public class int_vs_INTEGER
{
    public static void main(String[] args)
    {
        int a = 10;
       // System.out.println(a.); here we have an access to extra functionalities
        System.out.println(a);

        // converting primitive data type to wrapper class
        Integer b = a;
        System.out.println(b.hashCode());
        System.out.println(b.toString());
        System.out.println(b.compareTo(a));
        System.out.println(b.shortValue());
    }
}
