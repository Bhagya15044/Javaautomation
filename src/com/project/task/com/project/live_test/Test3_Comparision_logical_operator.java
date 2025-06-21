package com.project.live_test;

public class Test3_Comparision_logical_operator
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;

        if (a==b)
        {
            System.out.println(false);
        }
        if (a >b)
        {
            System.out.println(true);
        }
        if(a<b)
        {
            System.out.println(false);
        }
        if((a > b) && (a > 0))
        {
            System.out.println(true);
        }
        if((a < b) || (a > 0))
        {
            System.out.println(true);
        }
        if(!(a > b))
        {
            System.out.println(false);
        }
    }
}
