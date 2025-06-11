package com.project.task20_multilevel_inheritance;

public class Lab174_dynamic_dispatch
{
    public static void main(String[] args)
    {
        //Lab172_class_son s = new Lab171_class_father(); not possible because son was not present when father were born

        Lab171_class_father F = new Lab172_class_son(); // it is possible
    }
}
