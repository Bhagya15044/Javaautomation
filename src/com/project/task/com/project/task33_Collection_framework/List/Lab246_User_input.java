package com.project.task33_Collection_framework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab246_User_input
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList<>(); //this is in the form of dynamic dispatch,
        // we use father object refence for child object,
        // because we can access father's functionalities also, mostly prefers

        ArrayList arrayList = new ArrayList<>(); // here only child object functionalities we can use ,
        // no father functionality

        //WebDriver chrome = new ChromeDriver();

        List<String> names = new ArrayList<>();

        String ContinueInput = "Y";
        while (ContinueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name :");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();

            // this exit logic , if we not write this logic , it will continuously ask tenter the name
            System.out.println("Do you want to enter another name (Yes/No)");
            ContinueInput = scanner.nextLine();

        }
        for(String name : names)
        {
            System.out.println(name);
        }
        scanner.close();
    }
}
