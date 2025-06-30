package com.project.interviewing_java_chatgpt;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set
{
    public static void main(String[] args)
    {
        Set s = new HashSet<>();
        s.add("apple");
        s.add("apple");
        s.add("orange");
        s.add("mango");
        s.add(null);
        System.out.println(s);

        Set ls = new LinkedHashSet();
        ls.add("apple");
        ls.add("apple");
        ls.add("orange");
        ls.add("mango");
        ls.add(null);
        System.out.println(ls);

        Set ts = new TreeSet<>();
        ts.add("apple");
        ts.add("apple");
        ts.add("orange");
        ts.add("mango");
       // ts.add(null); not allowed
        System.out.println(ts);
    }
}
