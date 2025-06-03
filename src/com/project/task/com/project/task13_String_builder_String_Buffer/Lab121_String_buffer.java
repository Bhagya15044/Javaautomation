package com.project.task13_String_builder_String_Buffer;

public class Lab121_String_buffer
{
    public static void main(String[] args)
    {
        StringBuffer stringBuffer = new StringBuffer("java");
        stringBuffer.append("Programming");
        System.out.println(stringBuffer);
        stringBuffer.delete(5,16);
        System.out.println(stringBuffer);
        stringBuffer.replace(0,3, "C++");
        System.out.println(stringBuffer);
    }
}
