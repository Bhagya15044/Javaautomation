package com.project.live_test4;

public class Generic_Class_for_Pair
{
    public static void main(String[] args)
    {
        generic g = new generic<>("Test");
        generic g1 = new generic<>(100);
        System.out.println(g.getValues());
        System.out.println(g1.getValues());
    }
}
class generic<T>
{
    private T values;

    // parameterized constructor
    public generic(T values)
    {
        this.values = values;
    }

    // getter method(to access the private variables)
    public T getValues()
    {
        return values;
    }
}