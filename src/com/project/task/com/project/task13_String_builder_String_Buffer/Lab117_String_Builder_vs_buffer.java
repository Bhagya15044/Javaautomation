package com.project.task13_String_builder_String_Buffer;

public class Lab117_String_Builder_vs_buffer
{
    public static void main(String[] args)
    {
        //in automation 90% we can use normal string
        String s0 = "Bhagya";
        String s1 = new String("Bhagya");

        //< 10% used in automation
        // we have in built functions in string builder and string buffer

        StringBuffer stringBuffer = new StringBuffer("Bhagya");
        StringBuilder stringBuilder = new StringBuilder("Bhagya");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuffer.reverse());
    }
}
