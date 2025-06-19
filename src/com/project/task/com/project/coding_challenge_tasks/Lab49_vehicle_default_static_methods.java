package com.project.coding_challenge_tasks;

public class Lab49_vehicle_default_static_methods
{
    public static void main(String[] args)
    {
           Car2 c = new Car2();
           c.start();
           Vehicles.fuelType();
    }
}
class Car2 implements Vehicles
{

}
interface Vehicles
{
    public default void start()
    {
        System.out.println("Vehicle started");
    }
    public static void fuelType()
    {
        System.out.println("Fuel type is Petrol");
    }
}

/*
    Q: Why do we use default methods in interfaces?

    A: To provide a default implementation that all implementing classes can use or override. Introduced in Java 8 to enhance interface evolution without breaking existing implementations.

    Q: Why can't we override interface static methods?

    A: Because static methods belong to the interface itself, not the object or implementation class.
 */