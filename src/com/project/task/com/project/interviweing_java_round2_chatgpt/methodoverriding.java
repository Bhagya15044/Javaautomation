package com.project.interviweing_java_round2_chatgpt;

public class methodoverriding
{
    public static void main(String[] args)
    {
        Chrome c = new Chrome();
        c.open_browser();
        c.read_file();
        c.reading_excel_file();
        c.close_browser();
        System.out.println("-----------below is for microsoft edge------------");
        MicrosoftEdge me = new MicrosoftEdge();
        me.open_browser();
        me.read_file();
        me.reading_data_base_file();
        me.close_browser();
    }
}
class Test_cases
{
    public  void open_browser()
    {
        System.out.println("opening the browser ");
    }

    public void read_file()
    {
        System.out.println("reading the files");
    }
    public void close_browser()
    {
        System.out.println("closing the browser");
    }
}
class Chrome extends Test_cases
{
    public void reading_excel_file()
    {
        System.out.println("reading the excel file");
    }
}
class MicrosoftEdge extends Test_cases
{
    public void reading_data_base_file()
    {
        System.out.println("reading the data base file");
    }
}