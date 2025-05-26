package com.project.task7_switch_statement;

public class Lab67_JDK13_above
{
    public static void main(String[] args)
    {
        // in jdk 13

        int itemcode = 001;
        switch (itemcode)
        {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default -> System.out.println("default");
        }
    }
}
