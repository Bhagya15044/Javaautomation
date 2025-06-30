package com.project.interviweing_java_round2_chatgpt;

public class THROW_vs_THROWS
{
    public static void main(String[] args) throws ArithmeticException
    {
        int a = 10;
        int b= 0;
        try
        {
            int c= a/b;
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }

    }
}
