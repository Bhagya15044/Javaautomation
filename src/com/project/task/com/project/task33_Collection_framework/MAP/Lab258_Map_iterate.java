package com.project.task33_Collection_framework.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab258_Map_iterate
{
    public static void main(String[] args)
    {
        Map <String, Integer> m = new HashMap<>();
        m.put("id", 1);
        m.put(null, 1);
        m.put("id3",null);
        m.put("id", 2);
        m.put("id2",2);
        System.out.println(m);
        System.out.println("-------------------------------------");
        System.out.println(m.size());

        //iteration using for loop
        for(Map.Entry<String, Integer >item : m.entrySet())
        {
            System.out.println(item.getKey() +  "-->" + item.getValue());
        }

        System.out.println("----------------------------------");
        Map m1 = new HashMap();
        m1.put("Name" , "jhon");
        m1.put("Roll no", 23);
        m1.put("Phone no ","97663429928");

        Map m2 = new HashMap();
        m2.put("Name" , "mark");
        m2.put("Roll no", 43);
        m2.put("Phone no ","97663429148");

        // if we want to keep the two sets of students in one list
        List l = new ArrayList<>();
        l.add(m1);
        l.add(m2);
        System.out.println(l);
    }
}
