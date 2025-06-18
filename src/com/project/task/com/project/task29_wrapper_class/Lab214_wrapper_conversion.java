package com.project.task29_wrapper_class;

public class Lab214_wrapper_conversion
{
    public static void main(String[] args)
    {
        String num = "10"; // string have a number
        int a = 23;

        //String to wrapper conversion
        Integer b = Integer.parseInt(num);

        // parse x() --> every wrapper class having parse wrapper class( parseFloat, parseDouble...)

        // String to primitive conversion directly is possible
        int c = Integer.parseInt(num); //( String to wrapper class , wrapper class to primitive by unboxing)

        // string to integer
        Integer D = Integer.valueOf("10");
        System.out.println(D);

        // if we want to convert integer to string
        Integer E = 44;
        System.out.println(E.toString());

        // this is not possible , but this wrapper object creation is equal to below one
        //Integer F = new Integer("10");
        Integer F1 = 10;

       // integer to string conversion
        Integer G = 10;
        String s = G.toString();

        // unboxing
        int primitive_int = G;
        int primitive_int1 = G.intValue();

    }
}
