package com.project.interviweing_java_round2_chatgpt;

public class Abstraction
{
    public static void main(String[] args)
    {
        Test1 t1 = new Test1();
        t1.engine();
    }
}
abstract class Test
{
    abstract void engine(); // abstract method

    public static void engine1()
    {
        System.out.println("hey");
    }
}
class Test1 extends Test
{
    @Override
    void engine()
    {
        System.out.println("hey google");
    }
}