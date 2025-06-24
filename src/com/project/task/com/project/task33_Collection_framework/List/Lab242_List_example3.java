package com.project.task33_Collection_framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab242_List_example3
{
    public static void main(String[] args)
    {
        List list = new ArrayList<>();
        list.add("milk");
        list.add("butter");
        list.add("paneer");
        list.add("cheese");
        list.add("kova");
        list.add("jam");
        list.add("bread");
        list.add("Fresh cream");
        list.add("123");
        list.add(true);

        System.out.println(list);
        System.out.println(list.size());

        //print the elements using for each loop
        for(Object o : list)
        {
            System.out.println(o);
        }

        // using Iterator we can iterate and print the elements
        Iterator I = list.iterator();
        while (I.hasNext())
        {
            System.out.println(I.next());
        }
    }
}
