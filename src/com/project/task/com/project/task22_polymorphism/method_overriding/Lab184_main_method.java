package com.project.task22_polymorphism.method_overriding;

public class Lab184_main_method
{
    public static void main(String[] args)
    {
        Lab183_bhagya b = new Lab183_bhagya();
        System.out.println("----child class----");
        b.home();
        b.b1();
        b.f1();

        System.out.println("-----------------------");

        System.out.println("----father class----");
        Lab182_father f = new Lab182_father();
        f.f1();
        f.home();

        System.out.println("-----------------------");

        // dynamic dispatch
        System.out.println("----dynamic dispatch----");
        Lab182_father f1 = new Lab183_bhagya();
        f1.home();
        f1.f1();
    }
    /*
                      output console
                       --------------

----child class----
bhagya - 3 bhk
Bhagya - b1
Father - f1
-----------------------
----father class----
Father - f1
Father - 2 bhk
-----------------------
----dynamic dispatch----
bhagya - 3 bhk
Father - f1

Process finished with exit code 0

     */
}
