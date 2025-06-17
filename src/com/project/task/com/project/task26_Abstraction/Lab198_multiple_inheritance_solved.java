package com.project.task26_Abstraction;

public class Lab198_multiple_inheritance_solved
{
    // this code is also called as multiple interface or diamond problem.

}
class child1 implements Father1,mother1
{
    @Override
    public void money()
    {
        System.out.println("child has to pay the money!");
    }

    @Override
    public void m1()
    {
        System.out.println("m1");
    }

    @Override
    public void f1()
    {
        System.out.println("f1");
    }

    @Override
    public void df() {
        Father1.super.df(); // if you want from your father you can father default method
        mother1.super.df(); //  if you want from your mother you can mother default method
    }


}
interface Father1
{
    void money();
    void f1();

    default void df()
    {
        System.out.println("f1 default");
    }
}
interface mother1
{
    void money();
    void m1();
    default void df()
    {
        System.out.println("m1 default");
    }
}