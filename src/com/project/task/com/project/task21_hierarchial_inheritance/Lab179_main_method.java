package com.project.task21_hierarchial_inheritance;

public class Lab179_main_method
{
    public static void main(String[] args)
    {
        Lab178_son2 s2 = new Lab178_son2();
        s2.apartment();
        s2.home();

        System.out.println("--------------------");

        Lab176_son1 s1 = new Lab176_son1();
        s1.home();
        s1.gold();

        System.out.println("--------------------");

        Lab177_daughter d = new Lab177_daughter();
        d.farm();
        d.home();

        System.out.println("--------------------");

        Lab175_father f = new Lab175_father();
        f.home();
    }
}
