package com.project.interviweing_java_round2_chatgpt;

public class WRAPPER_CLASSES
{
    public static void main(String[] args)
    {
        int a = 5;
//        System.out.println(a.); no extra functionalities available
        Integer b = a; // it is auto boxing
        System.out.println(b.hashCode());
        System.out.println(b.floatValue());

        int c = b; // unboxing
       // System.out.println(c.); // no extra functionalities
        System.out.println(c);
    }
}
