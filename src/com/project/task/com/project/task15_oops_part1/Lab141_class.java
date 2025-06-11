package com.project.task15_oops_part1;

public class Lab141_class
{
    public static  void main(String[] args)
    {
        Lab142_ATBx bhagya = new Lab142_ATBx(); // when we call the another in this class
        // jvm will search for this class and loads the class loader
        // class --> Lab142_ATBx
        // object reference --> bhagya ( this object reference can access the attributes & behaviour present in that class)
        // new object --> new Lab142_ATBx()

        bhagya.name = "bhagya"; // this attribute
        bhagya.eat(); // this is behaviour.

        // creating another object is also possible
        Lab142_ATBx sri = new Lab142_ATBx();
        sri.age = 25;
        sri.walk();
    }
}
