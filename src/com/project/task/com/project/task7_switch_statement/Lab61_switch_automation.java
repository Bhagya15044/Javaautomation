package com.project.task7_switch_statement;

import java.util.Locale;
import java.util.Scanner;

public class Lab61_switch_automation
{
    /*
         In web automation
         I will ask the user to give the input from the browser which he wants to use
         I will start automation from the browser
     */

    /*
         possible edge cases:
         -------------------
         *negative values, special characters, overflow(90, 2000)
         *if user enter the browser name with capital so it is case-sensitive
         we can add one fix that is lowercase
     */

    public static void main(String[] args)
    {
       // String browser = args[0]; this CLI input we can use this one also , currently going the scanner class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = scanner.next();
        browser = browser.toLowerCase(); // it will handle the case-sensitive(Chrome,cHrome. CHROME)

        switch (browser)
        {
            case "chrome":
                System.out.println("start the browser");
                System.out.println("-----------------");
                System.out.println("Test case 1");
                System.out.println("Test case 2");
                break;

            case "Firefox":
                System.out.println("start the fire fox browser");
                // further code to start the firefox
                // webdriver driver = new firefox();  // this selenium code
                break;

            case "edge":
                System.out.println("Execute the edge code");
                break;

            default:
                System.out.println("I don't have any idea which browser it is ");
                break;
        }
    }
}
