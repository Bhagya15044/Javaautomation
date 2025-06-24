package com.project.task33_Collection_framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab244_List_example4
{
    public static void main(String[] args)
    {
        List marks = new ArrayList<>();
        marks.add("95");
        marks.add("93");
        marks.add("45");
        marks.add("52");
        marks.add("35");
        marks.add("15");
        marks.add("65");
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
    }
}
