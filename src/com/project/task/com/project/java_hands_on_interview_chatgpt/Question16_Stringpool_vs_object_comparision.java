package com.project.java_hands_on_interview_chatgpt;

public class Question16_Stringpool_vs_object_comparision
{
    public static void main(String[] args)
    {
        String a = "jhon";
        String b = "mark";
        String c =  new String( "Jhon");
        String d = "10";
        String e = "11";

        System.out.println(a.equals(c));

        if(d == e)
        {
            System.out.println("hey man");
        }
        else
        {
            System.out.println("Hello women");
        }
    }
}
