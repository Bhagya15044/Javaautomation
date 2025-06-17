package com.project.task26_Abstraction;

public class Lab200_interview_Qna
{
    public static void main(String[] args)
    {
        bhagya b = new sri(); // dynamic dispatch
        b.display();
        System.out.println("------------");
        sri s = new sri();
        s.display();
    }
}

class sri implements bhagya
{

    @Override
    public void display()
    {
        System.out.println(a);
    }
}
interface bhagya
{
    public int a = 10; // this should be always public
    void display();
}