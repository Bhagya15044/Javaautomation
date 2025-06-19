package com.project.coding_challenge_tasks;

public class Lab35_Rectangle_class
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(3,4);
    }
}
class Rectangle
{
    int length;
    int breadth;
    int area;

    Rectangle(int length , int width)
    {
        this. length = length;
        this.breadth = width;

        area = length * breadth;

        System.out.println(area);
    }
}