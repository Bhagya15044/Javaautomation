package com.project.java_hands_on_interview_chatgpt;

public class Question11_Wrapper_classes
{
    public static void main(String[] args)
    {
        //Autoboxing - converting primitive data types to the wrapper class,
        // benefits of autoboxing: to access the extra functionalities mostly use in the collection framework

        int a = 10;
        int k = Integer.valueOf(a); // You are converting a primitive int into an Integer object. Once it's an object, you gain access to extra functionalities
        System.out.println("K value :" +k);
        //System.out.println(a.); no extra functionalities available there
        System.out.println(a);
        Integer b = a;
        System.out.println(b.intValue()); // many extra functionalities there
        System.out.println(b.floatValue());
        System.out.println(b.hashCode());
        System.out.println(b.byteValue());

        double c = 3.4;
        double e = 4.4;
        //System.out.println(c.);no extra functionalities available there
        System.out.println(c);
        Double d = c;
        System.out.println(d.compareTo(e));
        System.out.println(d.byteValue());

        boolean f = true;
        //System.out.println(f.); no extra functionalities available there
        System.out.println(f);
        Boolean g = f;
        System.out.println(g.describeConstable());
        System.out.println(g.hashCode());

        System.out.println("------------unboxing the below details ---------------");

        // unboxing - converting back the wrapper class into the primitive data types and loose to access the extra functionalities
        int h = b;
       // System.out.println(h.); // loose the extra functionality
        System.out.println(h);

        double i = d;
        //System.out.println(i.); // loose the extra functionality
        System.out.println(i);

        boolean j = f;
      //  System.out.println(j.); //loose the extra functionality
        System.out.println(j);
    }
}
