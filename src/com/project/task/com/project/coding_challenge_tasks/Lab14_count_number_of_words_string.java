package com.project.coding_challenge_tasks;

import java.util.Scanner;

public class Lab14_count_number_of_words_string {
    public static void main(String[] args) {
        // Step 1: Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); // Read the full line including spaces

        // Step 2: Normalize the string by replacing multiple spaces/tabs/newlines with a single space
        // "\\s+" matches one or more whitespace characters
        str = str.replaceAll("\\s+", " ");

        // Step 3: Check if the input is empty or contains only spaces
        // If true, then there are 0 words
        if (str.trim().isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            // Step 4: Count number of spaces after normalization
            // This works because now each word is separated by a single space
            int spaceCount = str.length() - str.replaceAll(" ", "").length();

            // Step 5: Number of words = number of spaces + 1
            int wordCount = spaceCount + 1;

            // Print the final word count
            System.out.println("Number of words: " + wordCount);
        }

        // Step 6 (Last Step): Close the scanner to prevent memory leak
        scanner.close();
    }
}
