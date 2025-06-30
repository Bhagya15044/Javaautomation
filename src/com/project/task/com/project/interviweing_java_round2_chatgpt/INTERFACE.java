package com.project.interviweing_java_round2_chatgpt;

public class INTERFACE
{
    public static void main(String[] args)
    {
        Key k = new Key();
        k.ball();
        k.test();
    }
}
interface Lock
{
    default void test()
    {
        System.out.println("Hi everyone");
    }

    void ball();
}
class Key implements Lock
{

    @Override
    public void ball()
    {
        System.out.println("hey ):");
    }
}