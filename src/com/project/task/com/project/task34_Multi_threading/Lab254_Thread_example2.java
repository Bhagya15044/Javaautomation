package com.project.task34_Multi_threading;

public class Lab254_Thread_example2
{
    public static void main(String[] args)
    {
        // given task 1 --> go from 1 to 5 ( this task can be given to Class Tho3 worker) ,
        // if we want to give another task like :
        // given task 2 --> go from 1 to 100 , we need to create another worker class, because this multitasking

        ThreadGroup threadGroup = new ThreadGroup("Workers");

        Th03 t = new Th03( threadGroup, "worker1");
        t.start();

        Th03 t1 = new Th03(threadGroup,"worker2");
        t1.start();


        for (int i = 0; i < 5; i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

// create a Thread by class

class Th03 extends Thread
{
    public Th03(ThreadGroup threadGroup, String name)
    {
        super(threadGroup, name);
    }


    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
        }
    }
}