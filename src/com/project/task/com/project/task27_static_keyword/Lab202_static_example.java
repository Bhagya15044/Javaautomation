package com.project.task27_static_keyword;

public class Lab202_static_example
{
    public static void main(String[] args)
    {
       ATB bhagya = new ATB(9385671,"bhagya ");
       ATB sri = new ATB(9385571,"sri ");
       System.out.println(bhagya.name +  bhagya.ph_no);
       System.out.println(ATB.course_name);
       ATB.mark_attendance();
       System.out.println("------------------------------");
       System.out.println(sri.name +  sri.ph_no);
       System.out.println(ATB.course_name);
       ATB.mark_attendance();
    }
}
class  ATB
{
    int ph_no;
    String name;
    static  String course_name = "ATB";

    public ATB(int ph_no, String name)
    {
        this.ph_no = ph_no;
        this.name = name;
    }

    void display()
    {
        System.out.println(this.ph_no+this.name+course_name);
    }

    static void mark_attendance()
    {
        System.out.println("Mark attendance");
    }
}
