package com.project.task32_Generics;

public class Lab232_Generics
{
    // Generics will handle all data types at once, no need to specify the datatype ,
    // if we specific one data type, we cannot store the values of another data type ,
    // but in generics we store all the data types.
    public static void main(String[] args)
    {
        tempsum(3,4);
        tempsum(3.5, 5.6);
        tempsum("bhagya", "sri");
    }
    static <T> T tempsum(T a , T b)
    {
        System.out.println(a + "" + b);
        return null;
    }
}
