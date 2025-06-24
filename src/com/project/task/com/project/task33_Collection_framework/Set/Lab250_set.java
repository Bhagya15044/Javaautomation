package com.project.task33_Collection_framework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab250_set
{
    /*
         Hashset --> ( no insertion order(random), store unique values,one null value allowed, no duplicates allowed)
         LinkedHashSet -->(maintains insertion order, no duplicates allowed)
         TreeSet-->(maintains natural insertion order, no duplicates, no null values)
     */
    public static void main(String[] args)
    {
        Set hs = new HashSet<>();

        hs.add("Bhagya");
        hs.add("bhagya");
        hs.add("Bhagya");
        hs.add("sree");
        System.out.println(hs);
        //---------------------------------------
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

    }
}
