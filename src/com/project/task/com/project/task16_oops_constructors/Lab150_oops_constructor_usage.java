package com.project.task16_oops_constructors;

import java.io.FileInputStream;

public class Lab150_oops_constructor_usage
{
    public static void main(String[] args)
    {
        A a1 = new A();
        System.out.println(a1);
    }
}
class A
{
    A()
    {
        System.out.println("I want to read csv file");
        System.out.println("open the page before loading the scripts");
        System.out.println("you can do anything which you want , when object is created");
        //FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}