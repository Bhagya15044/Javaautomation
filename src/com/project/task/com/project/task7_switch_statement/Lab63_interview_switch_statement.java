package com.project.task7_switch_statement;

public class Lab63_interview_switch_statement
{
    public static void main(String[] args)
    {
        /*
            possible edge cases are --> 'a', other than 'A'  Ascii value
         */
        char ch = 'A';
        switch (ch)
        {
            case 65 :
                System.out.println("Match ASCII Value");
              break;
            default:
                System.out.println("No match");
        }
    }
}
