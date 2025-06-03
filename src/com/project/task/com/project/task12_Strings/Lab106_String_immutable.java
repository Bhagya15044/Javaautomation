package com.project.task12_Strings;

import java.util.Locale;

public class Lab106_String_immutable
{
    public static void main(String[] args)
    {
        String name = "Bhagya"; // stored in string constant pool
        // existing string cannot be changed
        // always new string will be created
        name.toUpperCase();
        System.out.println(name);
    }
}
