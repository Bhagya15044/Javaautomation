package com.project.live_test4;

import java.util.Scanner;

public class Custom_Exception_Example
{
    public static void main(String[] args)  throws InvalidAgeException  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        if(age<18)
        {
            throw new InvalidAgeException();
        }
        else
        {
            System.out.println("enjoy your goa trip");
        }
    }
}
class InvalidAgeException extends Throwable
{
    
}