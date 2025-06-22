package com.project.live_test2;

public class Abstract_shape_implementation
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        System.out.println(r.getArea());
        System.out.println("-----------");
        circle c = new circle();
        System.out.println(c.getArea());
    }
}
abstract  class Shape
{
    abstract boolean getArea();
}
class Rectangle extends Shape {
    @Override
   public boolean getArea()
    {
        int length = 5;
        int width = 3;
        int area = length * width;
        System.out.println(area);
        return true;
    }
}
class circle extends Shape
{
    @Override
   public  boolean getArea()
    {
        int r = 4;
        double area = Math.PI*r*r;
        System.out.println(area);
        return true;
    }
}