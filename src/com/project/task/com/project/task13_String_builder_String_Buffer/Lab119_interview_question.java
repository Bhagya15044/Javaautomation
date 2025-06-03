package com.project.task13_String_builder_String_Buffer;

public class Lab119_interview_question
{
    public static void main(String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder("Bhagya");
        stringBuilder.append("sri");
        System.out.println(stringBuilder); // first bhagya is created and
        // next sri will replace as Bhagyasri.
        // So only one string is created.
    }
}
