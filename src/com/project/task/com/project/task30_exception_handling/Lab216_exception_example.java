package com.project.task30_exception_handling;

public class Lab216_exception_example
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 10;
        int c = b/a; // arthimetic exception , cannot divide by zero.
        System.out.println(c);

        // unchecked exception --> arthimetic exception , null pointer exception

        String s = null;
        s.trim(); // null pointer exception , cannot invoke s.trim()
    }
}
