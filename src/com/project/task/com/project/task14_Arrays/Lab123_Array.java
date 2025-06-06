package com.project.task14_Arrays;

public class Lab123_Array
{
    /*
         Array is a group or collection elements having same data type with fixed size length.  .
     */
    public static void main(String[] args)
    {
        int a = 10; // normal initialization+declaration

        int[] marks = { 91,92,84,78,86,99}; // this an array

        System.out.println(marks.length); // Access the length or size of array using length function.
        System.out.println(marks[0]); // way to access the elements
        System.out.println(marks[3]);
        System.out.println(marks[-1]); // ArrayIndexOutOfBoundsException

        boolean [] is_married_people = {true,false,true,false};

        char ch = 'A';
        String name = "Bhagya";
        String [] names_each_element = name.split("");// ["B" , "h" ,"a, "g" , "y", "a"]

    }
}
