package com.project.live_test;

import java.util.Scanner;

public class Test5_Number_classification
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int ab = s.nextInt();

        if(ab>0)
        {
            System.out.println("positive");
        }
        else
        {
            System.out.println("negative");
        }
    }
}
