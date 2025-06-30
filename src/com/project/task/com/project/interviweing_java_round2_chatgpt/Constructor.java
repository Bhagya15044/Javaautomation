package com.project.interviweing_java_round2_chatgpt;

import javax.swing.table.TableColumn;

public class Constructor
{
    public static void main(String[] args)
    {
        child c = new child("Jhon", 34);
        child c1 = new child("SBI", 300000);
        c.getAge();
        c.getName();
        c1.getBank_name();
        c1.getBalance();
        c.CALL();
    }
}
class father
{
    private int age;
    private String name;
    private String bank_name;
    private int balance;

    // parameterized constructor

    public father(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public father(String bank_name, int balance)  // constructor overloading
    {
        this.bank_name = bank_name;
        this.balance = balance;
    }

    // getter and setter methods

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBank_name()
    {
        return bank_name;
    }

    public void setBank_name(String bank_name)
    {
        this.bank_name = bank_name;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public void CALL()
    {
        System.out.println("name : " + name + "age : " + age + "bank name : " + bank_name + " balance : " + balance);
    }
}
class child extends father
{

    public child(int age, String name)
    {
        super(age, name);
    }

    public child(String bank_name, int balance)
    {
        super(bank_name, balance);
    }

}