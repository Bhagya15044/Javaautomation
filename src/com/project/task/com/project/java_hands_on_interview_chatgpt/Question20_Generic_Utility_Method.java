package com.project.java_hands_on_interview_chatgpt;

public class Question20_Generic_Utility_Method
{
    public static void main(String[] args)
    {
        // Passing Integer array
        Integer[] intArray = {1, 2, 3, 4};
        Print.printArray(intArray);


        // Passing String array
        String[] strArray = {"apple", "banana", "cherry"};
        Print.printArray(strArray);


        // Passing Double array
        Double[] doubleArray = {1.1, 2.2, 3.3};
        Print.printArray(doubleArray);

    }
}
class Print
{
    public static <T> void printArray(T[] a)
    {
        for (T element : a)
        {
            System.out.println(element);
        }
        System.out.println("---------------");
    }

}