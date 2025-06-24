package com.project.task33_Collection_framework.List;

import java.util.ArrayList;
import java.util.Collections;

public class Lab245_Interview_Qna
{
    public static void main(String[] args)
    {
        ArrayList <Integer> al = new ArrayList();

        // they have given 1, 2,3 4 and asked to print 24, 18, 12, 6
        // logic is reverse all the given elements and multiply with 6

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());

        for(Integer o : al)
        {
            System.out.println(6*o);
        }
    }
}
