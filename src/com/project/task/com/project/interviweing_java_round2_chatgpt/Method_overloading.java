package com.project.interviweing_java_round2_chatgpt;

public class Method_overloading
{
    public static void main(String[] args)
    {
        Browsers b = new Browsers();
        System.out.println(b.browser("chrome"));
        System.out.println(b.browser("microsoftEdge", "mozilla firefox"));
        System.out.println(b.browser("Google","opera","safari"));
    }
}
class Browsers
{
    String browser(String a)
    {
        return a;
    }
    String browser(String a , String b)
    {
        return a+b;
    }
    String browser(String a , String b, String c)
    {
        return a+b+c;
    }
}