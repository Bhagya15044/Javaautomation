package com.project.task32_Generics;

import com.project.coding_challenge_tasks.Lab38_single_inheritance_animal;

import java.util.ArrayList;
import java.util.List;

public class Lab234_Generic_List
{
    public static void main(String[] args)
    {
        List <Integer> int0 = new ArrayList<>(); // this list only store integer values, because we specified the data type , it is not a generic in nature
        int0.add(12);
        int0.add(34);
        int0.add(90);
        //int0.add("bhagya");

        List type = new ArrayList<>(); // here <> it will say i will store all types of data types, no need to specify the generic name
        type.add("bhagya");
        type.add(3);
        type.add(4.6);
        type.add(true);
    }
}
