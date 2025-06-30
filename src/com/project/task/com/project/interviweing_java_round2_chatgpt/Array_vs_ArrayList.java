package com.project.interviweing_java_round2_chatgpt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_vs_ArrayList
{
    public static void main(String[] args)
    {
        // to demonstrate the array
        int [] a = new int[5]; // fixed size, only one data allowed to store the elements
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        System.out.println("-------------------------");
        // using for loop

        for (int i = 0; i <5 ; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("-------------------------------------");
        // ArrayList --> random order, allow duplicates, allow null
        List l = new ArrayList<>();
        l.add("Bhagya");
        l.add("Bhagya");
        l.add("sree");
        l.add("apple");
        l.add("123");
        l.add(null);
        l.add(true);
        System.out.println(l);

        System.out.println("-----------------------------------------");
        // for each loop
        for (Object o : l)
        {
            System.out.println(o);
        }

        //print the elements using iterator
        System.out.println("-----------------------");
        Iterator i = l.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
