package com.project.task8_for_loop;

public class Lab87_for_loop_even_using_continue
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 50; i++)
        {
            if( i % 2 == 0) // this condition to print even number using continue,

            {
                System.out.println(i); // here it will give even number
                // because we written the printing statement before the continue keyword.
                continue;
            }
            //System.out.println(i); //here it will give odd number
            // because continue keyword will skip the even number and give you odd number

            // or use reverse (i%2!=0) for printing odd number,
            // but written the printing statement as it is ,
            // if write before the continue  give the odd ,
            // after the continue will give even
        }
    }
}
