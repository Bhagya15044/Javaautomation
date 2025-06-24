package com.project.task32_Generics;

public class Lab233_Generic_class
{
    public static void main(String[] args)
    {
    GenericClass g1 = new GenericClass(10);
    GenericClass g2 = new GenericClass("BHAGYA");
    GenericClass g3 = new GenericClass(10.56);
    GenericClass g4 = new GenericClass(true);
    }
}

//class GenericClass // this is not a generic class
//{
//    private Integer data;
//
//    // parameterized constructor
//    public GenericClass(Integer data)
//    {
//        this.data = data;
//    }
//
//    // Getter method
//    public Integer getData()
//    {
//        return data;
//    }
//
//
//}

class GenericClass<T>  // <> says i am going to return ,This is a generic class
{
    private T data;

    // parameterized constructor
    public GenericClass(T data)
    {
        this.data = data;
    }

    // Getter method
    public T getData()
    {
        return data;
    }


}