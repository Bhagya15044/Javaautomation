package com.project_final_handson_practice;

public class Method_overriding_dynamic_dispatch
{
    public static void main(String[] args)
    {
        Animal a = new Dog();
        a.make_sound();
        Animal a1 = new Cat();
        a1.make_sound();
        Animal a2 = new Cow();
        a2.make_sound();
    }
}
class Animal
{
    public  void make_sound()
    {
        System.out.println("All animals will make a sound");
    }
}
class Dog extends Animal
{
    @Override
    public  void make_sound()
    {
        System.out.println("Woof");
    }
}
class Cat extends Animal
{
    @Override
    public  void make_sound()
    {
        System.out.println("Meow");
    }
}
class Cow extends Animal
{
    @Override
    public  void make_sound()
    {
        System.out.println("Moo");
    }
}
