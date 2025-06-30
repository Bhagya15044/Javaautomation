package com.project.interviewing_java_chatgpt;

public class this_vs_super
{
    public static void main(String[] args)
    {
        a a1 = new a("mark", 24);
        a1.test1();
        System.out.println(a1.name);
        System.out.println(a1.age);
    }
}
class a
{
    String name;
    int age;

    public a(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void test1()
    {
        System.out.println("name : " + name+ "age : "+age);
    }
}
class b extends a
{

    public b(String name, int age)
    {
        super(name, age);
    }
}
