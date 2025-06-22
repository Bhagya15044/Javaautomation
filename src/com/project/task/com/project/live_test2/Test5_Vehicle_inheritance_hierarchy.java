package com.project.live_test2;

public class Test5_Vehicle_inheritance_hierarchy
{
    public static void main(String[] args)
    {
       Car c = new Car();
       c.start();
       System.out.println("------------");
       Bike b = new Bike();
       b.start();
    }
}
class Vehicle
{
    public void start()
    {
        System.out.println("Engine is ready to start");
    }
}
class Car extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Car engine starts with a roar! ");
    }
}
class Bike extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Bike engine starts with a purr! ");
    }
}