package com.project.coding_challenge_tasks;

public class Lab43_super_keyword
{
    public static void main(String[] args)
    {
        Father f = new Father("20 acres Land", 1000000);
        f.show_property();
        System.out.println("-------------------");
        Son s = new Son("30 acres land",800000);
        s.show_property();
    }
}
class Father
{
   String property_name;
   int cost;

   Father(String property_name,int cost)
   {
       this.property_name = property_name;
       this.cost = cost;

   }

   public void show_property()
   {
       System.out.println("proof for my Agriculture loan approval");
   }
}

class Son extends Father
{

    Son(String property_name, int cost)
    {
        super(property_name, cost);
    }

    @Override
    public void show_property()
    {
        super.show_property();
        System.out.println("proof for my education loan approval");
    }
}
