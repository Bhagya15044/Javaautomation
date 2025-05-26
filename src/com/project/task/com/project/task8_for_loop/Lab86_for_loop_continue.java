package com.project.task8_for_loop;

public class Lab86_for_loop_continue
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 50; i++)
        {
            if(i==5)
            {
                continue;
                // it will skip that number and continue to execute,
                // number 5 is skipped and printed up-to 49 from 0
            }
            System.out.println(i);
        }
    }
}
