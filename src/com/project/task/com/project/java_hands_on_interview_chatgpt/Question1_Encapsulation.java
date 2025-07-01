package com.project.java_hands_on_interview_chatgpt;

public class Question1_Encapsulation
{
    public static void main(String[] args)
    {
         Bank b = new Bank("Jhon", "MUMBAI",200000);
        System.out.println(b.getBank_name());
        System.out.println(b.setBank_balance(500000 , true));
        System.out.println(b.getBank_balance());
        System.out.println(b.getBank_branch());
    }
}
class Bank
{
    private String Bank_name;
    private String Bank_branch;
    private int Bank_balance;

    //Creating the parameterized constructor

    public Bank(String bank_name, String bank_branch, int bank_balance)
    {
        Bank_name = bank_name;
        Bank_branch = bank_branch;
        Bank_balance = bank_balance;
    }

    // creating setters and getters method

    public String getBank_name()
    {
        return Bank_name;
    }

    // I don't want to set the bank name , it is my choice
//    public void setBank_name(String bank_name )
//    {
//            Bank_name = bank_name;
//    }

    public String getBank_branch()
    {
        return Bank_branch;
    }

    public void setBank_branch(String bank_branch)
    {
        Bank_branch = bank_branch;
    }

    public int getBank_balance()
    {
        return Bank_balance;
    }

    public boolean setBank_balance(int bank_balance , boolean isValidATMPin)
    {
        if(isValidATMPin)
        {
            Bank_balance = bank_balance;
        }
        else
        {
            System.out.println("Incorrected pin entered");
        }
        return isValidATMPin;
    }
}