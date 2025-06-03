package com.project.task12_Strings;

public class Lab113_String_examples
{
    public static void main(String[] args)
    {
        String s = "Java";
        char c = s.charAt(0); // returns the character present in 0th index
        System.out.println(c);
        System.out.println(s.codePointAt(0)); // code point index returns the unicode value of index(in inside which is character)

        //comparetoignorecase ( it will compare the both strings and ignore the case-sensitive)

        int result = "abc".compareToIgnoreCase("ABC"); // if both are not equal it will return 0
        System.out.println(result);

        int result1 = "abc".compareTo("ABC"); // both are equal returns the difference value of ascii of both strings
        System.out.println(result1);

        int idx = "java".indexOf('a');
        System.out.println(idx);

        int idx1 = "java".lastIndexOf("a");
        System.out.println(idx1);

        boolean b = " ".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("-" , "java", "python"); // join --> use delimiter(-)
        System.out.println(s11);

        String s12 = "java".replace("a","o");
        System.out.println(s12);

        boolean b1 = "java".startsWith("ja");
        System.out.println(b1);
    }
}
