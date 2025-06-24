package com.project.task33_Collection_framework.List;

import java.util.Stack;

public class Lab248_Stack
{
    // stack follows the Last in and first out concept
    public static void main(String[] args)
    {
        Stack stack = new Stack<>();
        stack.add("Bhagya");
        stack.add("Naga");
        stack.add("sri");
        stack.add("ammu");
        stack.add("aloo");
        System.out.println(stack);

        System.out.println("---------------------");

        Stack st = new Stack<>();
        st.push("Bhagya");
        st.push("sri");
        st.push("kavya");
        st.push("Navya");
        System.out.println(st);

        System.out.println("---------------------");

        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek()); // gives first element from the top without removing it from the stack
        System.out.println(st.pop()); // removes the first element from the stack
        System.out.println(st);
    }
}
