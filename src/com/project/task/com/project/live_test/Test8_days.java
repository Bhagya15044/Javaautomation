package com.project.live_test;

import java.util.Scanner;

public class Test8_days
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int day = 0;

        switch (day)
        {
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("sunday");

            default:
                System.out.println("not matched");

        }
    }
}
