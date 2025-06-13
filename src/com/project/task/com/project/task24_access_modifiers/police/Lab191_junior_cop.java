package com.project.task24_access_modifiers.police;

public class Lab191_junior_cop
{
    public static void main(String[] args)
    {
       Lab189_cop jr_cop = new Lab189_cop(10);
        //System.out.println(jr_cop.gun); not able access because gun is private

        jr_cop.can_I_shoot(); // able access this can i shoot method which is present in cop class,
        // because the access modifier we used id protected,
        // protected means we can access within the package
    }
}
