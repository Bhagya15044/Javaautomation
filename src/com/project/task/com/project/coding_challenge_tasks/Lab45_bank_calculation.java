package com.project.coding_challenge_tasks;

public class Lab45_bank_calculation
{
    public static void main(String[] args)
    {
        SBI sbi = new SBI();
        sbi.getInterestRate();
        HDFC hdfc = new HDFC();
        hdfc.getInterestRate();
    }
}
abstract class Banks
{
    abstract void getInterestRate();
}
class SBI extends Banks
{
    @Override
    void getInterestRate()
    {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}
class HDFC extends Banks
{

    @Override
    void getInterestRate()
    {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}