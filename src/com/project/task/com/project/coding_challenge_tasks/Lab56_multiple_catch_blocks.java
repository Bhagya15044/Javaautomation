package com.project.coding_challenge_tasks;

public class Lab56_multiple_catch_blocks
{
    public static void main(String[] args)
    {
        String input= args[0];
        int b = Integer.parseInt(input);
        int d = 0;
        try
        {
            d = 20/b;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(d);


    }
}
