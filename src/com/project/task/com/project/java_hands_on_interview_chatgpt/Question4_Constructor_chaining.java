package com.project.java_hands_on_interview_chatgpt;

public class Question4_Constructor_chaining
{
    public static void main(String[] args)
    {
        Car c = new Car("SUV","TOYOTA");
        c.vehicle_start();
        c.car_start();
    }
}
class Vehicle
{
    String vehicle_Type;

    //no argument constructor

    public Vehicle()
    {
        System.out.println("No argument constructor");
    }

    //Parameterized constructor

    public Vehicle(String vehicle_name)
    {
        this.vehicle_Type = vehicle_name;
    }

    public void vehicle_start()
    {
        System.out.println(vehicle_Type);
    }
}
class Car extends Vehicle
{
    String brand;

    //No arguments constructor
    public Car()
    {

    }

    //parameterized constructor
     public Car(String vehicle_Type, String brand )
     {
         super(vehicle_Type);
         this.brand = brand;
     }

    public void car_start()
     {
         System.out.println(brand);
     }
}