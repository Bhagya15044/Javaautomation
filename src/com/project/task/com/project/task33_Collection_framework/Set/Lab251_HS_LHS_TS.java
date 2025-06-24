package com.project.task33_Collection_framework.Set;

import java.util.*;

public class Lab251_HS_LHS_TS
{
    public static void main(String[] args)
    {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("watermelon");
        fruits.add("Guava");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add(null);
        fruits.add(null);
        System.out.println(fruits);

        Set<String> fruits1 = new LinkedHashSet<>();
        fruits1.add("Apple");
        fruits1.add("Apple");
        fruits1.add("watermelon");
        fruits1.add("Guava");
        fruits1.add("orange");
        fruits1.add("kiwi");
        fruits1.add(null);
        fruits1.add(null);
        System.out.println(fruits1);

        Set<String> fruits3 = new TreeSet<>();
        fruits3.add("Apple");
        fruits3.add("Apple");
        fruits3.add("watermelon");
        fruits3.add("Guava");
        fruits3.add("orange");
        fruits3.add("kiwi");
//        fruits3.add(null); it is not allowed in treeset , it will give .NullPointerException
//        fruits3.add(null);
        System.out.println(fruits3);

        Iterator i = fruits3.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
