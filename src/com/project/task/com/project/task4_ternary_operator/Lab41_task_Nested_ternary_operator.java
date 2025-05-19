package com.project.task4_ternary_operator;

public class Lab41_task_Nested_ternary_operator
{
    //nested ternary ---> result = condition1 ? expression1 : condition2 ? expression 2 : expression 3
    public static void main(String[] args)
    {
        int age = 11;
        String result = (age < 18) ? "minor" : ((age >=60) ? "senior citizen" : "adult");
        System.out.println(result);
    }
}
