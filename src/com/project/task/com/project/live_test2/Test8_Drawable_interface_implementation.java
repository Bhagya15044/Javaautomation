package com.project.live_test2;

public class Test8_Drawable_interface_implementation
{
    public static void main(String[] args)
    {
       rectangle r = new rectangle();
       r.draw();
       System.out.println("----------");
       Circle c = new Circle();
       c.draw();
    }
}
interface Drawable
{
    public  void draw();
}
class Circle implements Drawable
{

    @Override
    public void draw()
    {
        System.out.println("Drawing a Circle ");
    }
}
class rectangle implements Drawable
{

    @Override
    public void draw()
    {
        System.out.println("Drawing a Rectangle");
    }
}