package com.project.coding_challenge_tasks;

public class Lab51_interface_polymorphism
{
    public static void main(String[] args)
    {
        // both these are dynamic method dispatch
         Playable p = new Guitar();
         Playable p1 = new Piano();
         p.play();
         p1.play();
    }
}
interface Playable
{
    abstract void play();
}
class  Guitar implements Playable
{
    @Override
    public void play()
    {
        System.out.println("Playing Guitar");
    }
}
class Piano implements Playable
{
    @Override
    public void play()
    {
        System.out.println("Playing Piano");
    }
}
/*
    If asked:
   "What type of polymorphism is this?"
   Say:
   "Runtime polymorphism, achieved using an interface reference pointing to different implementations. Method resolution happens during execution, not compile-time."
 */