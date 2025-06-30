package com.project.interviweing_java_round2_chatgpt;

public class final_vs_finally_keyword_usage
{
    public static void main(String[] args)
    {
        // this is final keyword usage
        final int a = 10;
        System.out.println(a);

        // this below code to show about finally keyword usage
        int c = 10;
        int b= 0;
        try
        {
            int d = c/b;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.exit(0); // here withis line finally block cannot be executed
            System.out.println("i will be there every time");
        }

    }
}
