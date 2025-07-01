package com.project.java_hands_on_interview_chatgpt;

public class Question5_Abstraction
{
    public static void main(String[] args)
    {
        CreditCardPayment ccp = new CreditCardPayment();
        ccp.connect();
        ccp.processPayment();
        ccp.generateReceipt();
        ccp.disconnect();
    }
}
interface PaymentGateWay
{
    abstract void connect();
    abstract void disconnect();
}
abstract class Transaction
{
    abstract void processPayment();

    public void generateReceipt()
    {
        System.out.println("Receipt Generated");
    }
}
class CreditCardPayment extends Transaction implements PaymentGateWay
{

    @Override
    public void connect()
    {
        System.out.println("server is connected");
    }

    @Override
    public void disconnect()
    {
        System.out.println("server timeout");
    }

    @Override
    void processPayment()
    {
        System.out.println("Payment done");
    }
}