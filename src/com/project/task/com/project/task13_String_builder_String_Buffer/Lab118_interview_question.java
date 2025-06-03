package com.project.task13_String_builder_String_Buffer;

public class Lab118_interview_question
{
    public static void main(String[] args)
    {
        StringBuffer stringBuffer = new StringBuffer("Bhagya");
        stringBuffer.append("sri");
        System.out.println(stringBuffer); // first bhagya is created and
        // next sri will replace as Bhagyasri.
        // So only one string is created.
    }
}
