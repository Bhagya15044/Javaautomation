package com.project.live_test2;

public class Test1_person_class_implementation
{
    public static void main(String[] args)
    {
        Person p = new Person("jhon", 25);
        Person p1 = new Person("Alice",30);
        System.out.println(p);
        System.out.println(p1);
    }
}
class Person
{
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}