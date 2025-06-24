package com.project.task33_Collection_framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab238_Arraylist
{
    public static void main(String[] args)
    {
        List list = new ArrayList<>();
        list.add("1"); // index --> 0
        list.add("2"); // index --> 1
        list.add("3"); // index --> 2
        list.add("4"); // index --> 3
        list.add("5"); // index --> 4
        list.add("6"); // index --> 5
        list.add("7"); // index --> 6
        list.add("8"); // index --> 7
        list.add("8"); // index --> 8
        list.add(true);// index --> 9

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("5"));
        System.out.println(list.contains(5));
        System.out.println(list.indexOf("6"));
        System.out.println(list.lastIndexOf("8"));

        // iterate the list
        for (int i = 0; i <list.size() ; i++)
        {
            System.out.println(list.get(i));
        }

        // iterate the list using for each loop(advanced)
        for (Object o : list)  // why we used Object here , because we are handling multiple data types data
        {
            System.out.println(o);
        }

        // iterate the list using iterator(more advanced, mostly preferred in collection)
        Iterator I = list.iterator();
          while (I.hasNext())
          {
              System.out.println(I.next());
          }
        }
    }

