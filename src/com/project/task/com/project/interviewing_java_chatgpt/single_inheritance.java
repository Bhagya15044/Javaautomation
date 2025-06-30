package com.project.interviewing_java_chatgpt;

import javax.swing.plaf.PanelUI;

public class single_inheritance
{
    public static void main(String[] args)
    {
        B b = new B();
        b.test();
    }
}
class A
{
    public void test()
    {
        System.out.println("hey");
    }
}
class B extends A
{
    @Override
    public void test()
    {
        System.out.println("hey google , how are you ?");
    }
}