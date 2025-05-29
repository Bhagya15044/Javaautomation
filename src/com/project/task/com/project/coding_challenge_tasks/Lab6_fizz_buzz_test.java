package com.project.coding_challenge_tasks;

public class Lab6_fizz_buzz_test
{
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {
            if((i%15==0))  // this is the lcm of both 3 & 5 ,
                // so if any value that is both multiples of 3 & 5 ,
                // if we are not given this so ,
                // else if condition skip buzz and only print the fizz,
                // so 15 is the lcm and multiples of 15 is both multiples of 3& 5
                // so if both multiples number came this 15 will execute and print fizzbuzz
            {
                System.out.println("FizzBuzz");
            }
            if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
