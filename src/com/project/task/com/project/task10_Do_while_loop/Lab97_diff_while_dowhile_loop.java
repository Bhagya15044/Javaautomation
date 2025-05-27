package com.project.task10_Do_while_loop;

public class Lab97_diff_while_dowhile_loop
{
    public static void main(String[] args)
    {
        int a = 0;

        while(a<0)
        {
            System.out.println(a);
            a++;
        }

        do
        {
            System.out.println(a); // at-least print once before checking the condition
            a++;
        }while (a<0);
    }
}
