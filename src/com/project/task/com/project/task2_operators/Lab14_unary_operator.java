package com.project.task2_operators;

public class Lab14_unary_operator
{
    public static void main(String[] args)
    {
        int a = +10; //an arithmetic operator is present in-front of literal, so will say it is having + internally
        int b = -110;
        int result = a+b;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        int c = -1;
        c= c+1;
        System.out.println(c);
    }
}
