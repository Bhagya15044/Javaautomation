package com.project.interviweing_java_round2_chatgpt;

public class encapsulation
{
    public static void main(String[] args)
    {
        Bank b = new Bank("Jhonmark@gmail.com","admin123");
        b.setUsername("jhonmark145@gmail.com");
        System.out.println( b.getUsername());
        b.setPassword("Pass123",true);
        System.out.println( b.getPassword());
       // b.setPassword("Pass123",false); // here i don't to allow the customer to change the password that's why i kept false


    }
}
class Bank
{
    private String Username;
    private  String Password;

    //parameterized constructor

    public Bank(String username, String password)
    {
        Username = username;
        Password = password;
    }

    //Getter and setter methods

    public String getUsername()
    {
        return Username;
    }

    public void setUsername(String username)
    {
        Username = username;
    }

    public String getPassword()
    {
        return Password;
    }

    public void setPassword(String password ,boolean is_admin)
    {
        if(is_admin)
        {
            Password = password;
        }
       else
        {
            System.out.println("Not an Admin, not allowed to change the password");
        }
    }
}