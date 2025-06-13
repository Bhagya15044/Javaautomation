package com.project.task26_Abstraction;

public class Lab193_abst
{

}
class vehicle
{
    public int max_speed = 180;

    void no_test()
    {

    }
    vehicle()
    {
        System.out.println("default constructor");
    }
    vehicle(int a)
    {
        System.out.println("parameterized constructor");
    }
    vehicle(int a , int b)
    {
        System.out.println("default constructor");
    }
}

class car extends vehicle
{
    private int Max_speed = 281;

    car()
    {
       super(100);
    }
    void test()
    {

    }
    car(int c)
    {
        System.out.println("PC car");
    }
}