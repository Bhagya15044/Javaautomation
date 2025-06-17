package com.project.task26_Abstraction;

public class Lab195_abstract_class_example
{
    public static void main(String[] args)
    {
        WagonR car = new WagonR();
        car.drive(); // By calling this drive methods we are the implement methods of engine
    }
}
class WagonR extends engine implements tyre , gear
{
    // allow multiple interfaces as well

    void  drive()
    {
        // calling both the methods
        rubber_tyre();
        black_colour_do_to_tyre();
        start_engine();
        change_gear();
        stop_engine();
    }
    @Override
    void start_engine()
    {
        System.out.println("start the WagonR");
    }

    @Override
    public void rubber_tyre()
    {

    }

    @Override
    public void black_colour_do_to_tyre()
    {

    }

    @Override
    public void burn_the_tyre()
    {

    }

    @Override
    public void change_gear()
    {

    }
}
abstract class engine
{
    abstract void start_engine(); // this is incomplete function/method

    void stop_engine() // this is complete function/method, abstract class can have both concrete methods
    {
        System.out.println("stop");
    }
}
interface tyre
{
    // it will allow multiple classes to inherit, using implement keyword
    // interface did not allow to complete the method, it should be incomplete
    // by using default keyword , it will allow to complete the method
    void rubber_tyre(); // incomplete method
    void  black_colour_do_to_tyre(); // incomplete method

    //after JDK 11 this  2 features(default, static to use in interface) was introduced
    default void burn_the_tyre()
    {
        // complete method

    }

    static void burn_the_tyre1()
    {

    }
}
interface gear
{
    void  change_gear();
}