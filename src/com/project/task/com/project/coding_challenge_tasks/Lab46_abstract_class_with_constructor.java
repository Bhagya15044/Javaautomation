package com.project.coding_challenge_tasks;

public class Lab46_abstract_class_with_constructor
{
    public static void main(String[] args)
    {
        charger c = new charger();
        c.sim();
    }
}
abstract class phone
{
    phone()
    {
        System.out.println("Abstract class constructor called");
    }
}
class charger extends phone
{
    void sim()
    {
        System.out.println("Method from abstract class");
    }
}