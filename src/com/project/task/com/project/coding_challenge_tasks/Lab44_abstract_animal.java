package com.project.coding_challenge_tasks;

public class Lab44_abstract_animal
{
    public static void main(String[] args)
    {
         Dogs d = new Dogs();
         d.make_sound();
         Cat c = new Cat();
         c.make_sound();
    }
}
abstract class Animals
{
    abstract void make_sound();
    // abstract methods cannot have a body
}
class Dogs extends Animals
{
    @Override
    void make_sound()
    {
        System.out.println("Dog Barks");
    }
}
 class Cat extends Animals
{
    @Override
    void make_sound()
    {
        System.out.println("cat meows");
    }
}