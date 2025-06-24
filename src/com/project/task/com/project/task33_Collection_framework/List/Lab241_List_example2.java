package com.project.task33_Collection_framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab241_List_example2
{
    public static void main(String[] args)
    {
        List list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add(true);
        System.out.println(list.get(3));
        System.out.println(list.lastIndexOf(5));
        System.out.println(list.size());
        System.out.println(list.contains("4"));
        System.out.println(list.isEmpty());
        System.out.println(list.hashCode());
    }
}
