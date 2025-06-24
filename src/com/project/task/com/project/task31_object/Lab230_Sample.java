package com.project.task31_object;

public class Lab230_Sample extends Object
{
    // simply remember object is god( having every method), we are extending from god with unique features
       @Override
        public String toString() // it covert object into string values, and return that string values in console.
       // because suppose we are creating object in main method and calling without toString() method. it returns memory address
       //without toString(), we can call attributes with object reference( like s.start()), it is different scenario
        {
            System.out.println("This is coming from object class");
            return null;
        }

        @Override
       public int hashCode() // returns unique value (remember it is fingerprint, so one person fingerprint cannot match the other person fingerprint)
        {
            System.out.println("This is coming from object class");
            return 0;
        }

        @Override
        public boolean equals(Object obj)
        {
            System.out.println("This is coming from object class");
            return true;
        }
}
