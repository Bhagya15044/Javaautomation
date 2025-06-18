package com.project.task30_exception_handling;

public class Lab220_null_pointer_exception_example4
{
    public static void main(String[] args) throws Exception
    {
        String s = null;
        s.trim();  //java.lang.NullPointerException: Cannot invoke "String.trim()" because "s" is null
    }
}
