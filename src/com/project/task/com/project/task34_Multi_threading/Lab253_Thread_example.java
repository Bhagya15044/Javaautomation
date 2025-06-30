package com.project.task34_Multi_threading;

public class Lab253_Thread_example
{
    // Garbage collector will choose main, and finalize will shut down all this.
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();
        for (int i = 0; i <10 ; i++)
        {
            System.out.println(t.getName() + i + " - "+ t.getThreadGroup() + " - " + t.getPriority());

        }
    }
}
