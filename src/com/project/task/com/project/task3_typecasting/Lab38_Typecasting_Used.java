package com.project.task3_typecasting;

public class Lab38_Typecasting_Used
{
    public static void main(String[] args)
    {
        int course = 100;
        float GST = 18.45f;
        //int total1 = course+GST; implicit narrowing
        int total = course+(int)GST; //explicit narrowing
        System.out.println(total);
        float f = course+GST; // this valid to store because decimal values will also taken by this
        float e = (float)course+GST; // this valid to store because decimal values will also taken by this
        System.out.println(f);
// always store in big datatype container to avoid data loss, decimal values.
    }
}
