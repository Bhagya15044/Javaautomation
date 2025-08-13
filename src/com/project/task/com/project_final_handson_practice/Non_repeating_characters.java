package com.project_final_handson_practice;

public class Non_repeating_characters
{
    public static void main(String[] args) {
        String s = "aabbcddeffg";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  // it will give the character at the position of i from string
            if (s.indexOf(c) == s.lastIndexOf(c)) { // it will check the first index and last index , if the index is same then it return the 
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
