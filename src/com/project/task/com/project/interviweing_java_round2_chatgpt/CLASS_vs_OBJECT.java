package com.project.interviweing_java_round2_chatgpt;

public class CLASS_vs_OBJECT
{
    public static void main(String[] args)
    {
        House h = new House();  // new House is object, h is object reference
        h.blue_print();
    }
}
class House  // this is a class
{
    public void blue_print()
    {
        System.out.println("house blue print is ready");
    }
}