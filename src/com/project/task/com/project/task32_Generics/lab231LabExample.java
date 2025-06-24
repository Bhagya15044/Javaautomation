package com.project.task32_Generics;

public class lab231LabExample
{
    public static void main(String[] args)
    {
        int result = sum(3,4);
        System.out.println(result);
        double result1 = sum(3.4, 6.7);
        System.out.println(result1);
    }
    static int sum(int a, int b)
    {
        return  a + b;
    }
    static double sum(double a, double b)
    {
        return  a + b;
    }
}
