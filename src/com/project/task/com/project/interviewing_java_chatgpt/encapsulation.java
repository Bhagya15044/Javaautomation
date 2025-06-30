package com.project.interviewing_java_chatgpt;

public class encapsulation
{
    public static void main(String[] args)
    {
        bank b = new bank("SBI", "VIZAG",20000);
        b.setBalance(30000 , true);
        System.out.println(b.getBalance(true));
        System.out.println(b.getBank_name());

    }
}
class bank
{
    private String bank_name;
    private String branch_name;
    private int balance;

    //parameterized constructor
    public bank(String bank_name, String branch_name, int balance)
    {
        this.bank_name = bank_name;
        this.branch_name = branch_name;
        this.balance = balance;
    }

    //getter and setter method

    public String getBank_name()
    {
        return bank_name;
    }

    public void setBank_name(String bank_name)
    {
        this.bank_name = bank_name;
    }

    public String getBranch_name()
    {
        return branch_name;
    }

    public void setBranch_name(String branch_name)
    {
        this.branch_name = branch_name;
    }

    public int getBalance(boolean b)
    {
        return balance;
    }

    public void setBalance(int balance , boolean is_valid_password)
    {
        if(is_valid_password)
        {
            this.balance = balance;
        }
       else
        {
            System.out.println("pin is invalid");
        }
    }
}