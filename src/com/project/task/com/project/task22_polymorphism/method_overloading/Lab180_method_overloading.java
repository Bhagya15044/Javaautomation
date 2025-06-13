package com.project.task22_polymorphism.method_overloading;

public class Lab180_method_overloading
{
    /*
          here after class loading happened by class loader
          a new object is created
          with that object reference we can call the methods present in math-operations class
          this method calling will decide decided by jvm at the compile time
          like which method in called function is matching to the calling function
     */
    public static void main(String[] args)
    {
        Lab181_math_operations m = new Lab181_math_operations();
        m.add(3,4);
        m.add(2,3,4);
        m.add(3.65,4.25);
    }
}
