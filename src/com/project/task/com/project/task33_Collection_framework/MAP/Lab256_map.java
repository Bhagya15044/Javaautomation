package com.project.task33_Collection_framework.MAP;

import java.util.*;

public class Lab256_map
{
    public static void main(String[] args)
    {
      //Map m = new Map(); // we cannot create object for Map directly , because it is an interface;
        /*
           Map is key-value pair
           Variable name  is a key (Name , Roll No, Phone number),
            key is generic in nature,
            key can be fixed with Data Type.
            no order maintain in the key

           Variable value/literal is a Value.(Pramod, 23, 9763429128)
            value can be keep like a object or data type.

           fixing is like
           Map<String, Object> hm = new HashMap<>(); // this can also be possible.
           Map<String, String> hm = new HashMap<>(); // this can also be possible.
           if we do;t maintain above two fixes then all data types are allowed.

           Name : "Pramod"
           Roll no : 23
           Phone no : 9763429128

           PUT --> Put the key with the value into the Map
         */

        Map hm = new HashMap<>();  // hashmap does not give the proper insertion order
        hm.put("Name" , 23);
        hm.put("Roll no", 23);
        hm.put("Phone no ","97663429128");
        System.out.println(hm);


         Map LHM = new LinkedHashMap(); // LinkedHashMap maintains the proper insertion order.
         LHM.put("Name" , 23);
         LHM.put("Roll no", 23);
         LHM.put("Phone no ","97663429128");
         System.out.println(LHM);

         Map TM = new HashMap<>(); // TreeMap maintains natural sorting order(based on alphabets)
        TM.put("Name" , 23);
        TM.put("Roll no", 23);
        TM.put("Phone no ","97663429128");
        System.out.println(TM);
    }
}
