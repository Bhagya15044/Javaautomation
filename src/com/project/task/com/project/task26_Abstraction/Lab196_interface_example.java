package com.project.task26_Abstraction;

public class Lab196_interface_example
{
    public static void main(String[] args)
    {
        car1 c = new car1();
        c.drive();
    }
}
class car1 implements brakes, engine1
{


    void drive()
    {
        start_engine();
        stop_engine();
        apply_break();
    }

    @Override
    public void test_engine()
    {
        System.out.println("override by the car 1");
    }

    @Override
    public void apply_break()
    {
        System.out.println("Apply the Break");
    }

    @Override
    public void start_engine()
    {
        System.out.println("start the engine");
    }

    @Override
    public void stop_engine()
    {
        System.out.println("stop the engine");
    }
}
interface brakes
{
    void apply_break();
}
interface engine1
{
    void start_engine();
    void stop_engine();
    default void test_engine()
    {
        System.out.println("concrete complete");
    }
}