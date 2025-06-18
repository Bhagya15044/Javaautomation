package com.project.task30_exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab219_file_not_found_exception_example3
{
    // this is checked exception , jvm will know about this exception , jvm asking us throw the exception USING BY  TRY CATCH
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("C://log.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
