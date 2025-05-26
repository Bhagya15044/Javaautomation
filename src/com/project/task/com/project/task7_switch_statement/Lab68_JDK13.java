package com.project.task7_switch_statement;

public class Lab68_JDK13
{
    public static void main(String[] args)
    {
        int itemcode = 007;
        switch (itemcode)
        {
            case 001 , 002 , 005:
                System.out.println(" take multiple expression in one case ");
                break;

            case 006,007,004:
                System.out.println("same as above");
                break;
            default:
                System.out.println("None");
        }
    }
}
