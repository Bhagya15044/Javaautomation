package com.project.task12_Strings;

public class Lab115_String_example2
{
    public static void main(String[] args)
    {
        String s = "unhappy".substring(2);
        System.out.println(s);

        String s1 = "java".substring(1,3);
        System.out.println(s1);

        char[]arr = "java".toCharArray();
        System.out.println(arr); // 'j' . 'a', 'v', 'a'

        String st = "  java  ".trim(); // it removes the extra spaces
        System.out.println(st);

        boolean b = "  ".isBlank();
        System.out.println(b);

        String sr = "ab".repeat(3);
        System.out.println(sr); // it will repeat the same string 3 times

        String sf = String.format("%s = %d" , "age",25);
        System.out.println(sf);
    }
}
