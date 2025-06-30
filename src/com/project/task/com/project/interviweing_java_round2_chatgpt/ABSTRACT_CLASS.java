package com.project.interviweing_java_round2_chatgpt;

public class ABSTRACT_CLASS
{
    public static void main(String[] args)
    {
        website w = new website();
        w.chrome();
        w.firefox();
    }
}
abstract class Browser
{
    abstract void chrome();
    public  void firefox()
    {
        System.out.println("open the browser");
    }
}
class website extends Browser
{
    @Override
    void chrome()
    {
        System.out.println("reading excel file");
    }
}