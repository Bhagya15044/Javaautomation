package com.project.task26_Abstraction;

public class Lab194_abstract_class
{
    public static void main(String[] args)
    {
        son s = new son();
        s.loan50k();
    }
}
class normal
{
    // normal class means it contains all methods, body
    // so normal class is called as concrete class and complete class
}
abstract  class  Father
{
    abstract void loan50k();
    // this is called as abstract class , because it is incomplete class , no_body , no method
    // abstract class cannot be final, because this is incomplete class and no further modifications are allowed
    // this abstract class details are hiding from the user by using the abstract class
}
class son extends Father
{

    // here implement method(override), is asking that you are extending the loan50k from your father class,
    // it is incomplete(he did not given or paid the loan),
    // so you can pay your father class loan
    // here we are showing the necessity details to end user by creating object for this son class in main method
    @Override
    void loan50k()
    {
        System.out.println("paid the father loan");
    }
}
