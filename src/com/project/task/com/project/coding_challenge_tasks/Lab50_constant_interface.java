package com.project.coding_challenge_tasks;

public class Lab50_constant_interface
{
    public static void main(String[] args)
    {
        Car_audi car_audi = new Car_audi();
        car_audi.speed_test();
    }
}
interface Speed_limit
{
    final int MAX_SPEED = 120;

}
class Car_audi implements Speed_limit
{
    public void speed_test()
    {
        System.out.println("Max Speed is: " + MAX_SPEED);
    }
}

/*
    Q: "Why didn't you use final explicitly for interface constants?"

    ans :"Because in Java, all interface variables are implicitly public static final, so it's redundant. However, for clarity or emphasis, we can write it out fully."
 */