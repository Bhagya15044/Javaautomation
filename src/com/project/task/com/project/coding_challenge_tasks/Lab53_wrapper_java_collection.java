package com.project.coding_challenge_tasks;

import java.util.ArrayList;

public class Lab53_wrapper_java_collection
{
    public static void main(String[] args)
    {
        int a = 5;
        Integer b = a;
        ArrayList<Integer> i = new ArrayList<>();
        i.add(a);
        i.add(10);  // autoboxing
        i.add(11);  // autoboxing again
        i.add(12);  // autoboxing again
        i.add(13);  // autoboxing again
        i.add(14);  // autoboxing again
        i.add(15);  // autoboxing again
        System.out.println("ArrayList: " + i);
    }
}
