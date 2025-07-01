package com.project.java_hands_on_interview_chatgpt;

public class Question9_Final_usage
{
    public static void main(String[] args)
    {
         Father f = new Father();
        System.out.println(f.a);
        f.Display();
    }
}
final class Father // it is a final class
{
    final int a = 20; // final variable
    public final void Display() // final method
    {
        System.out.println("Hey google");
    }
}
//class Mother extends Father
//{
//    @Override
//    public final void Display()  // cannot override the final method
//    {
//        System.out.println("Hey google chrome");
//    }
//    // errors when override the father class which is final
//    //'Display()' cannot override 'Display()' in 'com.project.java_hands_on_interview_chatgpt.Father'; overridden method is final
//    //java: cannot inherit from final com.project.java_hands_on_interview_chatgpt.Father
//}