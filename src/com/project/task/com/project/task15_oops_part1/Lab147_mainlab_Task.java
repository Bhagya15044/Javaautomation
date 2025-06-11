package com.project.task15_oops_part1;

public class Lab147_mainlab_Task
{
    public static void main(String[] args)
    {
        Lab146_task t = new Lab146_task();
        t.print_name(); // output is null because string default value is null
        // if we assign any value it will print that value

        //output  : Hi , your name is : null

        Lab148_Baby b = new Lab148_Baby(); // whenever this new object is created in baby class automatically a constructor is called.
        //output : Hi nani
    }
}
