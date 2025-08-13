package com.project.java_hands_on_interview_chatgpt;

public class Question17_marker_interface_implementation
{
    public static void main(String[] args)
    {
        Board b = new Board();
        if (b instanceof MyMarker) { // check whether the object is tagged to object or not
            b.show();
        } else {
            System.out.println("Not a marked object.");
        }
    }
}
interface MyMarker
{
    // this is marker interface so this interface don't have the methods only blank interface is present
    // after java 8 and before java 8 there are no methods like the normal interface
}
class Board implements MyMarker
{
    public void show()
    {
        System.out.println("Hey my name marker interface");
    }
}