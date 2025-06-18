package com.project.task30_exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab218_file_not_found_exception_example2
{
    // this is checked exception , jvm will know about this exception , jvm asking us throw the exception at method signature OR USING BY  TRY CATCH also
    public static void main(String[] args) throws FileNotFoundException // here directly we are asking to throw the file not found exception
    {
        FileInputStream fileInputStream = new FileInputStream("C://log.txt");
    }
}
