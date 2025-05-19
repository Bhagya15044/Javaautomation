package com.project.task5_increment_decrement_operator;

public class Lab48_inc_operator_interview_Qna
{
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
    }

    /*
          a++ --> expression -> 10 , but a value ->11
          +
          ++a --> expression -> 12(already a value is 11 now add+1) , but a value is 12
     */
}
