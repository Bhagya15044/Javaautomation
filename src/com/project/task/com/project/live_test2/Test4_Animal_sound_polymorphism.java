package com.project.live_test2;

public class Test4_Animal_sound_polymorphism
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.make_sound();
        System.out.println("----------------");
        Cat c = new Cat();
        c.make_sound();
    }
}
class Animal
{
    public void make_sound()
    {
        System.out.println("Animals make sound");
    }
}
class Dog extends Animal
{
    @Override
    public void make_sound()
    {
        System.out.println(" Woof! Woof! ");
    }
}
class  Cat extends Animal
{
    @Override
    public void make_sound()
    {
        System.out.println("Meow! Meow!");
    }
}