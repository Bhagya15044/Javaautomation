package com.project.task24_access_modifiers.criminal;

import com.project.task24_access_modifiers.police.Lab189_cop;

public class Lab190_Thief
{
    public static void main(String[] args)
    {
        Lab189_cop thief = new Lab189_cop(10);
        //thief.can_I_shoot();//thief is not able to access can is shoot method (which is present another package)
         // because it is private

        //System.out.println(thief.gun); thief is not able to access gun(which is present another package)
        // because it is private
    }
}
