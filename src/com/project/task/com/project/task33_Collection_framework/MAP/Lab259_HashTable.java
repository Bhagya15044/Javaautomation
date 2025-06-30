package com.project.task33_Collection_framework.MAP;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab259_HashTable
{
    public static void main(String[] args)
    {
        /*
             Map contains key, values, null values are allowed
             HashTable --> Synchronized, slow, legacy class,thread safe
             T1, T2 --> They will use one by one.
         */

        Hashtable<Integer ,String> HT = new Hashtable<>();
        HT.put(1,"one");
        HT.put(2,"two");
        HT.put(3,"three");
       // HT.put(4,null); // value as a null is not allowed.
        //HT.put(null, "four"); // key as a null is not allowed.

        // we can iterate the hashmap keys using enumeration.
        Enumeration <Integer> e = HT.keys();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
