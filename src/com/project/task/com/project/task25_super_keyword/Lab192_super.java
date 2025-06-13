package com.project.task25_super_keyword;

public class Lab192_super
{

}
class parent_class
{
   private String browser;


    //parameterized constructor
    public parent_class(String browser )
    {
        this.browser = browser;
    }

   //getter and setter methods
    public String getBrowser()
    {
        return browser;
    }

    public void setBrowser(String browser , boolean is_Admin) // this is admin is added to set browser, if the user is admin
    {
        if(is_Admin)
        this.browser = browser;
        else
        {
            System.out.println("change the browser is not allowed , you are not admin");
        }
    }

    void open_browser()
    {
        System.out.println("opening browser");
    }


    void open_browser(String browser_name)
    {
        System.out.println("open browser");
    }


    void close_browser()
    {
        System.out.println("closing browser");
    }
}

class testcase extends parent_class
{
    public  void tc()
    {

    }
    public testcase (String browser)
    {
        super(browser); // it will call the parent class constructor
        super.open_browser();
        super.open_browser("chrome");
        super.close_browser();

        this.tc();
    }
}