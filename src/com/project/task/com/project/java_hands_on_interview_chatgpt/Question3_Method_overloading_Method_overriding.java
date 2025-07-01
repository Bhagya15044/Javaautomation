package com.project.java_hands_on_interview_chatgpt;

public class Question3_Method_overloading_Method_overriding
{
    public static void main(String[] args)
    {
        AdvanceCalculator ac = new AdvanceCalculator();
        ac.add(3,4);
        ac.add(3.4 , 4.4);
        ac.add("Jhon", "Mark");
    }
}
class Calculator
{
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public void add(double a, double b)
    {
        System.out.println(a+b);
    }
    public void add(String a, String b)
    {
        System.out.println(a+b);
    }
}
class AdvanceCalculator extends Calculator
{
    @Override
    public void add(int a, int b)
    {
        super.add(a, b);
    }

    @Override
    public void add(double a, double b)
    {
        super.add(a, b);
    }

    @Override
    public void add(String a, String b)
    {
        super.add(a, b);
    }
}