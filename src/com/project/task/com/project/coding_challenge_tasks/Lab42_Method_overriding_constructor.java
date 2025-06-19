package com.project.coding_challenge_tasks;

public class Lab42_Method_overriding_constructor
{
    public static void main(String[] args)
    {
        Husband h = new Husband();
        h.Asset();
        System.out.println("-----------------------");
        Wife w = new Wife();
        w.Asset();
    }
}
class Husband
{
    public  void Asset()
    {
        System.out.println("I have my parents property");
    }
}
class Wife extends Husband
{
    @Override
    public  void Asset()
    {
        System.out.println("I have right to get my husband property");
    }
}