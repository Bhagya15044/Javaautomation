package com.project.task2_operators;

public class Lab17_Logical_operator
{
    /*
         && ----> AND
         || ----> OR
         ! ----> NOT(REVERSE)
     */
    public static void main(String[] args)
    {
        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c = true||false;
        System.out.println(c);

        boolean d = false&&true;
        System.out.println(d);
    }
}
