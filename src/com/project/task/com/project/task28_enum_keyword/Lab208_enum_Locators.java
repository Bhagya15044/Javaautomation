package com.project.task28_enum_keyword;

public class Lab208_enum_Locators
{
    public static void main(String[] args)
    {
        System.out.println(locators.page_button.getLocator());
    }
}
enum locators
{
    // To get the inside values of button,input we need to create constructor, getter method.
    page_button("btn"),
    page_input("input1");

    private String locator;

    //constructor
    locators(String locator)
    {
        this.locator = locator;
    }

    //getter method
    String getLocator()
    {
        return this.locator;
    }
}