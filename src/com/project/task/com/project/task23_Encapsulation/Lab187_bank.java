package com.project.task23_Encapsulation;

public class Lab187_bank
{
    public static void main(String[] args)
    {
        ICICI_bank bhagya = new ICICI_bank("bhagya", 100);
        System.out.println(bhagya.getBalance());

        boolean is_cashier = true;
        bhagya.setBalance(1000, is_cashier);
        System.out.println(bhagya.getBalance());
        System.out.println(bhagya.bank_name);
    }
}
class ICICI_bank
{
   private String name;
   private long balance;
   public String bank_name = "ICICI";

   //parameterized constructor
    public ICICI_bank(String name, long balance)
    {
        this.name = name;
        this.balance = balance;
    }

    //Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance , boolean is_cashier)
    {
        if (is_cashier)
        this.balance = balance;
        else
        {
            System.out.println("Not allowed to change the balance");
        }
    }
}