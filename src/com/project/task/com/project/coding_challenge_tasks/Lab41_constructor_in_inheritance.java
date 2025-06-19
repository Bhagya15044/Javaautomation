package com.project.coding_challenge_tasks;

public class Lab41_constructor_in_inheritance
{
    public static void main(String[] args)
    {
         ParentS P  = new ParentS("Maths", 97);
         P.exam_result();
         Children C = new Children("Physics", 89);
         C.exam_result();
         C.enjoy();
    }
}
class ParentS
{
    String subject_name;
    int marks;

    ParentS(String subject_name,int marks)
    {
        this.subject_name = subject_name;
        this.marks = marks;
        this.exam_result(); // calling myself
    }
    void exam_result()
    {
        System.out.println("Hey I have passed the exam");
    }
}

class Children extends ParentS
{

    Children(String subject_name, int marks)
    {
        super(subject_name, marks); // I am calling my parents, hey mom-dad
    }
    public void enjoy()
    {
        System.out.println("enjoying the holidays");
    }
}
