package com.project.coding_challenge_tasks;

public class Lab47_abstract_concrete_methods
{
    public static void main(String[] args)
    {
         Children1 c = new Children1();
         c.show();
         c.display();
    }
}
abstract  class Parent1
{
    abstract void show();
    void display()
    {
        System.out.println("Concrete method in abstract class");
    }
}
class Children1 extends Parent1
{

    @Override
    void show()
    {
        System.out.println("Abstract method implemented");
    }
}