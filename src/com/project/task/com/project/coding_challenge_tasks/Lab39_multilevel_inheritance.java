package com.project.coding_challenge_tasks;

public class Lab39_multilevel_inheritance
{
    public static void main(String[] args)
    {
         Grandparent g = new Grandparent();
         g.mango_farm();
         System.out.println("------------------------");
         Parent p = new Parent();
         p.bhk3();
         p.mango_farm();
         System.out.println("------------------------");
         Child c = new Child();
         c.car();
         c.bhk3();
         c.mango_farm();
    }
}
class Grandparent
{
    public void mango_farm()
    {
        System.out.println("Grandparent-I have mango farm i will give it to my son");
    }
}
class Parent extends Grandparent
{
    public void bhk3()
    {
        System.out.println("Parent - I have 3 bhk flat and I got mango farm from my father , I will give my flat to my son");
    }
}
class Child extends Parent
{
    public void car()
    {
        System.out.println("I have all 3 --> Mango farm, flat, and my car");
    }
}
