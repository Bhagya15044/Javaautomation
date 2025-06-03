package com.project.coding_challenge_tasks;

public class Lab12_reverse_string_using_inbuilt_function
{
    public static void main(String[] args)
    {
        StringBuffer stringBuffer = new StringBuffer("Helloworld");
        stringBuffer.reverse();
        System.out.println(stringBuffer); //StringBuffer is a mutable sequence of characters.
    }
}
