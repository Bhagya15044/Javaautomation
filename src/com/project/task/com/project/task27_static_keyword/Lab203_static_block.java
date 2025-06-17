package com.project.task27_static_keyword;

public class Lab203_static_block
{
    public static void main(String[] args)
    {
      A a = new A();
    }
}
class A
{
    static
    {
        System.out.println("called once when class is loaded");
        System.out.println("you can write a code for reading excel file, databased");
    }

    static  int a = 12;

    static void m1()
    {
        System.out.println("static function");
    }
}