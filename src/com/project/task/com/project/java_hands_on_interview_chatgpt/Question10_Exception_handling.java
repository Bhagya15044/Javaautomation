package com.project.java_hands_on_interview_chatgpt;

import java.util.Scanner;

public class Question10_Exception_handling
{
    public static void main(String[] args)  //throws Exception  // we can use throws in method signature and throw in catch same time , we can write  multiple throws in catch block
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int eh = scanner.nextInt();

        int a = 0;
        try
        {
            int c = eh/a;
        }
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException | Exception e) // this is advanced catch block to avoid writing multiple catch block, it saves time, memory,reduce the lines of code
//        {
//            System.out.println(e.getMessage());
//        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e )
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            //System.exit(0); to avoid the execution of finally block
            scanner.close(); // to the scanner we can use finally block
        }
    }
}
