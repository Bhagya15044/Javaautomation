package com.project.coding_challenge_tasks;

public class Lab37_Mobile_class
{
    public static void main(String[] args)
    {
          Mobile m = new Mobile("pocof5");
          Mobile m1 = new Mobile("pocof6",25000);
          System.out.println(m);
          System.out.println(m1);
    }
}
class Mobile {
    String brand;
    int price;

    Mobile(String brand) {
        this.brand = brand;
    }

    Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

   // When we override the toString() method, the object will give output in a string format when we print it.
    @Override
    public String toString()
    {
        return "Brand: " + brand + ", Price: " + price;
    }
}
