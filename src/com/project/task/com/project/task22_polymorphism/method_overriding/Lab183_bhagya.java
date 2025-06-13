package com.project.task22_polymorphism.method_overriding;

public class Lab183_bhagya extends Lab182_father
{
    void b1()
    {
        System.out.println("Bhagya - b1");
    }

    @Override // it will compare both the methods ( name should same)
        // and give better versioned method which new object is available
    void  home()
    {
        System.out.println("bhagya - 3 bhk");
    }
}
