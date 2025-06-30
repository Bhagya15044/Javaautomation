package com.project.task34_Multi_threading;

public class Lab255_Thread_example3
{
    public static void main(String[] args)
    {
        Runnable w1 = new Th04();
        Thread t1 = new Thread(w1);
        t1.start();

        Runnable w2 = new Th04();
        Thread t2 = new Thread(w2);
        t2.start();

        for (int i = 0; i <10 ; i++)
        {
            System.out.println(i + " - " + Thread.currentThread().getName());
        }
    }
}
class Th04 implements Runnable
{
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