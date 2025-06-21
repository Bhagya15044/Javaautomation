package com.project.live_test;

import java.util.Scanner;

public class Test7_Leap_year
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
         int year = s.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(isLeapYear)
         {
             System.out.println("year is : " + year + "Leap year");
         }
         else
         {
             System.out.println(year + "Not a leap year");
         }
    }
}
