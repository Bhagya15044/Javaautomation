package com.project.interviewing_java_chatgpt;

public class Lab1_Method_overloading
{
    public static void main(String[] args)
    {
        MethodOverloading mo = new MethodOverloading();
        System.out.println( mo.add(3,4));
        System.out.println( mo.add(3,7,4,5,6));
        System.out.println( mo.add(2,3,4,5));
        System.out.println(mo.add(1,2,3));
    }
}
class MethodOverloading
{
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b,int c)
    {
        return a+b+c;
    }
    int add(int a, int b, int c, int d , int e)
    {
        return a+b+c+d+e;
    }
    int add(int a, int b, int c, int d)
    {
        return a+b+c+d;
    }
}
