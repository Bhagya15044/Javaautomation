package com.project.coding_challenge_tasks;

public class Lab48_multiple_inheritance_in_interface
{
    public static void main(String[] args)
    {
        Document d = new Document();
         d.print();
         d.show();
    }
}
class  Document implements  Printable,Showable
{
    @Override
    public void  print()
    {
        System.out.println("Printing Document");
    }
    @Override
    public void show()
    {
        System.out.println("Showing Document");
    }
}
interface Printable
{
    void  print();
}
interface Showable
{
     void show();
}
