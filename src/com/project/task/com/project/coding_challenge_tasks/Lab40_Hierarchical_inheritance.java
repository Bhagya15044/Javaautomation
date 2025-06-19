package com.project.coding_challenge_tasks;

public class Lab40_Hierarchical_inheritance
{
    public static void main(String[] args)
    {
         Vehicle v = new Vehicle();
         v.engine();
         System.out.println("--------------");
         Cars c = new Cars();
         c.engine();
         System.out.println("--------------");
         Bike b = new Bike();
         b.engine();
    }
}
class  Vehicle
{
    public void engine()
    {
        System.out.println("I have good engine to start the vehicle");
    }
}
class Cars extends Vehicle
{
    @Override
    public void engine()
    {
        System.out.println("I have good engine to start the car");
    }
}
class Bike extends Vehicle
{
    @Override
    public void engine()
    {
        System.out.println("I have good engine to start the bike");
    }
}