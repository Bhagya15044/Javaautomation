package com.project.coding_challenge_tasks;

import java.util.Scanner;

public class Lab4_count_vowels_consonants_string
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Alphabets A-Z or a-z");
        String str = scanner.nextLine().toLowerCase();
        int VowelsCount = 0;// we need to declare initial value because its local variable
        int ConsonantsCount = 0;
        //check if users enter alphabet or not

        for (int i = 0; i <= str.length() - 1; i++)
        {
            char ch = str.charAt(i);
            if (Character.isLetter(ch))
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u')
                {
                    VowelsCount++;
                    System.out.println("total number of vowels::" + VowelsCount);
                }
                else
                {
                    ConsonantsCount++;
                    System.out.println("total number of consonants :: " + ConsonantsCount);
                }

            }
            else
            {
                System.out.println("invalid input please enter alphabet");
            }
        }
    }
}


