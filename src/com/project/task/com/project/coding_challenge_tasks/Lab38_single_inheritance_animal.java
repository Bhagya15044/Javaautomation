package com.project.coding_challenge_tasks;

public class Lab38_single_inheritance_animal
{
    public static void main(String[] args)
    {
         Animal a = new Animal();
         a.sound();
         System.out.println("----------------");
         Dog d = new Dog();
         d.sound();
    }
}
class Animal
{
    public  void sound()
    {
        System.out.println("All the Animals make sounds");
    }
}
class Dog extends Animal
{
    @Override
    public  void sound()
    {
        System.out.println("Dog is barking");
    }
}
