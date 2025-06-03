package com.project.task13_String_builder_String_Buffer;

public class Lab122_interviewQNA_reverse_without_using_inbuilt_function
{
    public static void main(String[] args)
    {
        String input = "Bhagya";

        for(int i = input.length()-1; i>=0 ; i--)
        {
            System.out.print(input.charAt(i));
        }
    }
}
