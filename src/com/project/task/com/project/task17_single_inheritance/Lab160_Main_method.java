package com.project.task17_single_inheritance;

public class Lab160_Main_method
{
    public static void main(String[] args)
    {
        Lab159_son_class S = new Lab159_son_class();
        System.out.println(S.gold);
         S.bhk2();
         S.bhk3();

         Lab161_cousin_class c =new Lab161_cousin_class();
          c.bhk3(); // cousin only her property , cousin is not able to access the property of father
    }
}
