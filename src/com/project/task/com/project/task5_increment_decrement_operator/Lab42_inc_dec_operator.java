package com.project.task5_increment_decrement_operator;

public class Lab42_inc_dec_operator
{
    public static void main(String[] args)
    {
        // take inputs from edit configurations-->program arguments, we can give n numbers of arguments , but if we give the less arguments it will arraybound exception error.
        String age_strings = args[0];
        String a = args[1];
        String b = args[2];
        String c = args[3];
        String d = args[4];

        // we can convert string into integer by use below syntax(Integer.parseInt)

        int age = Integer.parseInt(age_strings);
        System.out.println("int--->"+age);

        //we can convert string into float by use below syntax(Float..parseInt)

        float age1 = Float.parseFloat(age_strings);
        System.out.println("float---->"+age1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
