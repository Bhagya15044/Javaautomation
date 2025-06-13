package com.project.task22_polymorphism.method_overriding;

public class Lab185_real_example
{
    public static void main(String[] args)
    {
        test_case_chrome tc = new test_case_chrome();
        tc.open_browser();
    }
}
class  common_to_all_Test_Cases
{
    void open_browser()
    {
        System.out.println("open the browser");
    }
}
class  test_case_chrome extends common_to_all_Test_Cases
{
    @Override
    void open_browser()
    {
        System.out.println("starting a chrome");
        //new ChromeDriver();
    }
}