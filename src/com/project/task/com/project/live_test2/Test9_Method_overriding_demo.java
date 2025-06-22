package com.project.live_test2;

public class Test9_Method_overriding_demo
{
    public static void main(String[] args)
    {
        Parent p = new Parent();
        p.test();
        Child c = new Child();
        c.test();
    }
}
class Parent
{
    public void test()
    {
        System.out.println("Parent class display method ");
    }
}
class  Child extends Parent
{
    @Override
    public void test()
    {
        System.out.println("child class display method");
    }
}