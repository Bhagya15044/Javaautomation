package com.project.task33_Collection_framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab257_Hashmap
{
    public static void main(String[] args)
    {
        Map map = new HashMap<>();
        map.put("id", 1);
        map.put(null, 1); // one null is allowed to add in key
        map.put("id3", null); //null is allowed to add
        map.put("id", 2); // give latest value always
        map.put("id2",2); // if key is different and value is same , it will give that key and value.
        System.out.println(map);
        System.out.println(map.size()); // duplicates are not allowed to add
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));
        System.out.println(map.keySet()); // give how many keys are present totally, it will not allow duplicates to print
        System.out.println(map.values()); // it will print all the values
        System.out.println(map.get("id3")); // we will get the value of this key



        // output : {id2=2, id=2}
    }
}
