package com.project.task8_for_loop;

public class Lab85_for_loop_using_break
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 50; i++) // print 50 times , i values 0 to 49s
        {
            //System.out.println(i); // output is 0 to 5
            if (i == 5)
            {
                // System.out.println(i); // output is 5 , here we are breaking the statement
                break;
            }
            //System.out.println(i); //here output is 0 to 4
        }
    }
}
