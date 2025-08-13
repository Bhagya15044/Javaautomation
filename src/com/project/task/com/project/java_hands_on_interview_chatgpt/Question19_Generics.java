package com.project.java_hands_on_interview_chatgpt;

public class Question19_Generics
{
    public static void main(String[] args)
    {
       Printer p = new Printer<>(9);
       Printer p1 = new Printer<>(9.7);
       Printer p2 = new Printer<>("jhon");
       Printer p3 = new Printer<>(true);
       System.out.println(p.getValue());
       System.out.println(p1.getValue());
       System.out.println(p2.getValue());
       System.out.println(p3.getValue());
    }
}
class Printer<T>  // THIS CLASS SAYS THAT THIS IS A GENERIC CLASS
{
   private T value;  // generic variable initialization

   //parameterized constructor

    public Printer(T value)
    {
        this.value = value;
    }

    //getter method

    public T getValue()
    {
        return value;
    }
}