package com.project.task13_String_builder_String_Buffer;

public class Lab120_String_builder
{
    public static void main(String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("world");
        stringBuilder.reverse();
        System.out.println(stringBuilder); // first hello is created then world is appended to hello ,
        // later it was reversed and  printed the reversed string.
    }
}
