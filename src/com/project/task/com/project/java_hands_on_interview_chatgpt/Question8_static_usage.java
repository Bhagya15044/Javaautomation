package com.project.java_hands_on_interview_chatgpt;

public class Question8_static_usage
{
    public static void main(String[] args)
    {
        System.out.println(organization.a);
        organization.display();
    }
}
class organization
{
   public static int a = 10; // static variable

    public static void display() //static method
    {
        System.out.println("Hey Google");
    }
    static   // static block , it is used initialize the variables , static block will run once when class is loaded
    {
        int b = 25;
        System.out.println(b);
    }
}
