package com.project.task13_String_builder_String_Buffer;

public class Lab116_String_function
{
    public static void main(String[] args)
    {
        String name = "sonal"; // it will store in scp
        System.out.println(name.length());//5
        System.out.println(name.charAt(3)); //a
        System.out.println(name.charAt(10)); // it gives StringIndexOutOfBoundsException
    }
}
