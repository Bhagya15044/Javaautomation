package com.project.interviewing_java_chatgpt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list
{
    public static void main(String[] args)
    {
        List arraylist = new ArrayList<>();
        arraylist.add("bhagya");
        arraylist.add("sri");
        arraylist.add("sri");
        arraylist.add(null);
        System.out.println(arraylist);
        System.out.println(arraylist.size());
        System.out.println(arraylist.hashCode());

        List lhs = new LinkedList<>();
        lhs.add("bhagya");
        lhs.add("sri");
        System.out.println(lhs);
    }
}
