package com.project.task33_Collection_framework;

import java.util.*; // * --> it contains all interfaces and classes imported,
// instead of importing everything we can use this (*)

public class Lab237_List
{
    public static void main(String[] args)
    {
        List fruits = List.of("orange", " apple", "Guava", "Mango", "watermelon");
        System.out.println(fruits);

        System.out.println("-----------");

        List arraylist = new ArrayList<>();  // it is dynamic dispatch ( list --> interface , ArrayList --> class)
        arraylist.add("bhagya");
        arraylist.add("sri");
        arraylist.add("pineapple");
        arraylist.add("bhagya"); // duplicates allowed
        arraylist.add("Bhagya");
        arraylist.add(null); // null is allowed
        arraylist.add(123);// different data type is allowed
        arraylist.add(true);
        System.out.println(arraylist);
        System.out.println(arraylist.size());


    }
}
