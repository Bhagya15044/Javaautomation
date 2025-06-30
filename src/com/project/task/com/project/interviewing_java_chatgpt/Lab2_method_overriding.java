package com.project.interviewing_java_chatgpt;

public class Lab2_method_overriding
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.test();
    }
}
class Parent
{
    public void test()
    {
        System.out.println("hey , welcome");
    }
}
class Child extends Parent
{
    @Override
    public void test()
    {
        System.out.println("hey , welcome home ");
    }
}