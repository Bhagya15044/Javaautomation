package com.project.task28_enum_keyword;

public class Lab206_enum_example1
{
    public static void main(String[] args)
    {
        System.out.println(urls.katalon);
        if(urls.katalon.equals("katalon"));
        {
            System.out.println(" I want to do somethings");
        }
    }
}
enum urls
{
    google, firefox, chrome, katalon, restassured
}