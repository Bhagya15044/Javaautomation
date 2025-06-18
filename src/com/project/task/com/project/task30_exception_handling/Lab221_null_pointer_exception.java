package com.project.task30_exception_handling;

public class Lab221_null_pointer_exception
{
    public static void main(String[] args)
    {
        String s = null;
        try
        {
            s.trim();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        /*
         here "e" is reference variable ,
         generally we create object, Exception e = new Exception(),
         from this we have"e" that is the reference variable same we apply in this (Exception e),
         jvm is saying I will create instance(object) , directly u can use Exception e with the functionalities.
        */

    }
}
