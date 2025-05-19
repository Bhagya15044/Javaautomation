package com.project.task1;

public class Lab11_printf
{
    public static void main(String[] args)
    {
        int a = 20;
        System.out.println(a);
        //System.out.println("your variable is %d",a); // shows error
        System.out.printf("your variable is %d",a);

        /*
            printf statement is used for formatting the output
            %d => int, byte, short, long
            %s => String
            %f => float, double
            %b => boolean

         */
    }
}
