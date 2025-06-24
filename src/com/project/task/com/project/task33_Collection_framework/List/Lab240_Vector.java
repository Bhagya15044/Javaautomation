package com.project.task33_Collection_framework.List;

import java.util.Vector;

public class Lab240_Vector
{
    public static void main(String[] args)
    {
        Vector v = new Vector<>();
        v.add("Bhagya");
        v.add("sri");
        v.add("bhagya");
        System.out.println(v);
        v.remove("bhagya");
        System.out.println(v);
        System.out.println( v.contains("bhagya"));
        System.out.println(v.elementAt(1));
    }
}
