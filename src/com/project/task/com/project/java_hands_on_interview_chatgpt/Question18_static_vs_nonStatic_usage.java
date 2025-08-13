package com.project.java_hands_on_interview_chatgpt;

public class Question18_static_vs_nonStatic_usage
{
    public static void main(String[] args)
    {
        System.out.println("-------static methods--------");
        System.out.println(room.a);
        room.test();

        System.out.println("------non static methods------");
        room r = new room();
        System.out.println(r.b);
        r.engine();
    }
}
class room // nonstatic class
{
    static int a = 10; // static variable
    public static void test()
    {
        System.out.println("hey google");
    }
    static
    {
        System.out.println("hello");
    }

    // non static
    int b = 10; // non static variable
    public void engine() // nonstatic method
    {
        System.out.println("hey chrome");
    }
}