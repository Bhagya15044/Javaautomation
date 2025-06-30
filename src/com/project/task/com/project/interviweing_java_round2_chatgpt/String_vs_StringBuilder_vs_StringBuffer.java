package com.project.interviweing_java_round2_chatgpt;

public class String_vs_StringBuilder_vs_StringBuffer
{
    public static void main(String[] args)
    {
        String a = "Bhagya";
        String b = "bhagya";
        System.out.println(a.equals(b));
        System.out.println(a.charAt(3));
        System.out.println(a.concat("sri"));
        System.out.println(b.equalsIgnoreCase(a));

        
        StringBuilder stringBuilder =(new StringBuilder(5));
        System.out.println(stringBuilder.reverse());

        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.reverse());
    }
}
