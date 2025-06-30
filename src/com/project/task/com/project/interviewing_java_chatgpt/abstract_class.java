package com.project.interviewing_java_chatgpt;

public class abstract_class
{
    public static void main(String[] args)
    {
        test2 t = new test2();
        t.buy();
    }
}
 abstract class test
 {
     abstract void buy();
 }
 class test2 extends  test
 {
     @Override
     void buy()
     {
         System.out.println("hey google");
     }
 }
