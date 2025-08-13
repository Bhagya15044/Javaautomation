package com.project.java_hands_on_interview_chatgpt;

public class Question15_String_vs_StringBuilder
{
    public static void main(String[] args)
    {
        String a = "Jhon";
        String b = "Mark";
        String c = "jhon";

        System.out.println(a.equals(c));
        System.out.println(c.hashCode());
        System.out.println(a.hashCode());
        System.out.println(a); // original string is not changed, it created new object
        System.out.println(a.concat("mikki")); // trying to modifying the string by adding string literal to a

        System.out.println("--------String builder--------");
        StringBuilder s = new StringBuilder();
        s.append("chikki");
        System.out.println(s.append("likki"));
        s.reverse();
        System.out.println(s);



    }
}
