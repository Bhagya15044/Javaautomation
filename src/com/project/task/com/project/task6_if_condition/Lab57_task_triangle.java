package com.project.task6_if_condition;

import java.util.Scanner;

public class Lab57_task_triangle
{
    public static void main(String[] args)
    {
        // taking user inputs
        Scanner sc= new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("please enter the first triangle side value");
        n1=sc.nextInt();
        System.out.println("please enter the second triangle side value");
        n2=sc.nextInt();
        System.out.println("please enter the third triangle side value");
        n3=sc.nextInt();
        // we are asking either of the side value should be greater than 0 , we have taken this condition
        if(n1>0 && n2>0 && n3>0)
        {
            // we need to check  all sides so we have taken and condition
            if(n1==n2 && n2==n3)
            {
                System.out.println(" given triangle is equilateral");
            }
            // we need to check here either two sides so implemented or condition
            else if(n1==n2 || n2== n3|| n3==n1)
            {
                System.out.println(" given triangle is isosceles ");
            }
            else
            {
                System.out.println(" given triangle is scalene  ");
            }
        }
        else
        {
            System.out.println(" given triangle is not a valid triangle"); // if we give input 0 , this condition will print
        }
        sc.close();
    }

}
