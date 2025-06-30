package com.project.interviewing_java_chatgpt;

public class INTERFACE
{
    public static void main(String[] args)
    {
        child c = new child();
        c.loan();
    }
}
interface father
{
    void  loan();
}
class child implements father
{
    @Override
    public void loan()
    {
        System.out.println("paid all the loan amount taken by my father");
    }
}