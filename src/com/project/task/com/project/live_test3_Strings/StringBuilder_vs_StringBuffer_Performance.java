package com.project.live_test3_Strings;

public class StringBuilder_vs_StringBuffer_Performance
{
    public static void main(String[] args)
    {
        String a = "8ms";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1000);
        System.out.println(a);

        String b = "5ms";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuffer.append(1000);
        System.out.println(b);
    }
}
