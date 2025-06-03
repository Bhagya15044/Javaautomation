package com.project.task12_Strings;

public class Lab108_String_immutable1
{
    public static void main(String[] args)
    {
        String s1 = "hello";
        s1 = s1.concat("world");
        System.out.println(s1);
    }
}
// immutable means cannot change the old string , always creates new string