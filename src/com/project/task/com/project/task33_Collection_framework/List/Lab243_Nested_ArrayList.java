package com.project.task33_Collection_framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab243_Nested_ArrayList
{
    public static void main(String[] args)
    {
        List fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("kiwi");
        fruits.add("pineapple");
        fruits.add("jackfruit");
        fruits.add("Grapes");
        System.out.println(fruits);
        System.out.println(fruits.size());

        List fruits2 = new ArrayList<>();
        fruits2.add("lime");
        fruits2.add("custardapple");
        fruits2.add("papaya");
        fruits2.add("Mosambi");
        System.out.println(fruits2);

        List Vegetables = new ArrayList<>();
        Vegetables.add("Tomato");
        Vegetables.add("onion");
        Vegetables.add("chilli");
        Vegetables.add("potato");
        Vegetables.add("cucumber");
        Vegetables.add("Ladiesfinger");
        Vegetables.add("Drumstick");

        List All_fruits_vegetables = new ArrayList<>();
        All_fruits_vegetables.add(fruits);
        All_fruits_vegetables.add(fruits2);
        All_fruits_vegetables.add(Vegetables);

        System.out.println(All_fruits_vegetables);
        System.out.println(All_fruits_vegetables.size());
        System.out.println(All_fruits_vegetables.get(2));
    }
}

