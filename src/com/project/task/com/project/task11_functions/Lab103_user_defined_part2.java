package com.project.task11_functions;

import java.util.Scanner;

public class Lab103_user_defined_part2
{
    public static void main(String[] args)
    {
        /*
              User defined types : 4 ->
              -------------------------
              * without parameter , without return type
              * without parameter , with return type
              * with parameter , without return type
              * with parameter , with return type
         */

            without_parameter_without_returntype();

            String msg = greet_hello_without_parameter_with_return_type();
            System.out.println(msg);

            with_parameter_without_return_type("bhagya" , 24 , 33000);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = scanner.next();

            System.out.println("Enter your age");
            int age = scanner.nextInt();

            System.out.println("Enter your salary");
            double salary = scanner.nextDouble();

           with_parameter_without_return_type(name ,age ,salary);

           int result = sum_of_two_numbers(4,8);
           System.out.println(result);
    }

     // * without parameter , without return type

    static void without_parameter_without_returntype()
    {
        System.out.println(" Hi , How are you??");
    }

    // * without parameter , with return type

    static String greet_hello_without_parameter_with_return_type()
    {
        System.out.println("Hi , I will return ");
        return "Hi, How are you?";
    }

    //* with parameter , without return type
    static void with_parameter_without_return_type(String name , int age, double salary)
    {
        System.out.println("your name is --> " + name + "\n age is --> " + age + "\n salary" + salary);
    }

    //* with parameter , with return type ( use float, long, double as well, number of times we can pass)
    static int sum_of_two_numbers(int a , int b)
    {
        return a+b;
    }
}
