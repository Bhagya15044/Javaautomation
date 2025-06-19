package com.project.coding_challenge_tasks;

public class Lab34_car_class
{
    public static void main(String[] args)
    {
       Car c = new Car("Maruti swift" , "x10",100000);
    }
}
class Car
{
    String brand;
    String model;
    int price;

    Car(String brand, String model,int price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;

        System.out.println(" Brand : " + brand + " Model : " + model+ " Price : " + price);
    }
}
