package com.project.interviewing_java_chatgpt;

public class Constructor
{
    public static void main(String[] args)
    {
        Gold g = new Gold("Jhon", 23);
        g.buy();
        diamond d = new diamond(20000);
        d.buy();
    }
}
class Gold
{
    String name;
    int age ;

    public Gold()
    {
        // this is default constructor
    }

    // parameterized constructor

    public Gold(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void buy()
    {
        System.out.println("name : " + name+ "age :" + age);
    }
}
class diamond extends Gold
{
    int price;

    public diamond(int price)
    {
        this.price = price;
    }

    public diamond(String name, int age,int price)
    {
        super(name, age);
    }
}