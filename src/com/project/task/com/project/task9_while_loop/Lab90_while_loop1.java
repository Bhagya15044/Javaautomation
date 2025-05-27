package com.project.task9_while_loop;

public class Lab90_while_loop1
{
    public static void main(String[] args)
    {
        int i = 0;
        while(i>0) // here condition is failed 0>0
            // so it will not enter the loop,
            // it stop execution there itself,
            // so nothing will print
        {
            System.out.println("Enter");
            System.out.println(i);
            i++;
        }
    }
}
