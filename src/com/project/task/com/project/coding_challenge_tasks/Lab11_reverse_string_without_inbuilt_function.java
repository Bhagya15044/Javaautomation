package com.project.coding_challenge_tasks;

public class Lab11_reverse_string_without_inbuilt_function
{
    public static void main(String[] args)
    {
        String str  = "Helloworld";

        for( int a =str.length()-1; a>=0; a--)
        {
            System.out.print(str.charAt(a)); // if we cannot use this charAt() function
            // it will only print index of the character
        }
    }
}
