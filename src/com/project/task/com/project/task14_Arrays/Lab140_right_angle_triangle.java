package com.project.task14_Arrays;

import java.util.Scanner;

public class Lab140_right_angle_triangle
{
    /*
         pattern we want , n = 3
         *
         * *
         * * *
         * * * *
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number eg : 3");
        int n = scanner.nextInt();

        for (int i = 0; i <n ; i++) // only change in i loop  for left triangle i=n, i>=1
        {
            for (int j = 0; j <=i ; j++) // no change in j loop
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
