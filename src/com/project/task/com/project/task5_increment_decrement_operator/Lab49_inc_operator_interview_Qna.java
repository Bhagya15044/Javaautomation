package com.project.task5_increment_decrement_operator;

public class Lab49_inc_operator_interview_Qna
{
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);
    }

    /*
     ++a--> expressionA -> 11 , but a value -> 11
     +
     ++a--> expressionB -> 12, but a value -> 12

     expressionA + expressionB --> 11 + 12 -->13, a value = 12
     */


}
