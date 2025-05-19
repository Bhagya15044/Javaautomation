package com.project.task3_typecasting;

public class Lab37_long_short
{
    public static void main(String[] args)
    {
        long phone_no = 8976543921l;
        //short S=L; // implicit narrowing not possible to store
        short S = (short) phone_no;
        System.out.println(S);

    }
}
