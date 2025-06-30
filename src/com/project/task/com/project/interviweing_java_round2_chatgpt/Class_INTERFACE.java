package com.project.interviweing_java_round2_chatgpt;

public class Class_INTERFACE
{
    public static void main(String[] args)
    {
        Children c = new Children();
        c.test();
        c.test1();
    }
}
interface  Father
{
    void test();
    default void test1()
    {
        System.out.println("hey man");
    }
}
class Children implements Father
{
    @Override
    public void test()
    {
        System.out.println("Hello Google");
    }
}