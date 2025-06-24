package com.project.task33_Collection_framework.Queue;

import java.util.PriorityQueue;

public class Lab252_queue
{
    // automation usage --> 0.01%
    // fifo concept
    public static void main(String[] args)
    {
        PriorityQueue pq = new PriorityQueue<>();
        pq.add("Pramod");
        pq.add("Dutta");
        System.out.println(pq); // natural sorting
        pq.peek(); // show first element
        System.out.println(pq);
        pq.poll(); //remove first element
        System.out.println(pq);
    }
}
