package com.project.task24_access_modifiers.police;

public class Lab189_cop
{
    private int gun;
    String iCard;

   public Lab189_cop(int gun)
    {
        this.gun = gun;
    }

    protected void can_I_shoot()
    {
        System.out.println("yes you can shoot");
    }
}
