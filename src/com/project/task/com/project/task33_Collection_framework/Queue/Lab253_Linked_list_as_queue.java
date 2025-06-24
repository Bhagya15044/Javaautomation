package com.project.task33_Collection_framework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Lab253_Linked_list_as_queue
{
    public static void main(String[] args)
    {
        Queue<String> qu = new LinkedList<>();
        qu.add("divya");
        qu.add("bhagya");
        qu.add("kavya");
        System.out.println(qu);
    }
}
