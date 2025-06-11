package com.project.task20_multilevel_inheritance;

public class Lab173_main_method
{
    public static void main(String[] args)
    {
        Lab172_class_son s = new Lab172_class_son();
        s.bhk3();
        s.bhk();
        s.gf();
        s.extra();

        Lab171_class_father f = new Lab171_class_father();
        f.extra();
        f.bhk();
        f.gf();

        Lab170_class_Grandfather gf = new Lab170_class_Grandfather();
        gf.gf();
        gf.bhk();
    }
}
