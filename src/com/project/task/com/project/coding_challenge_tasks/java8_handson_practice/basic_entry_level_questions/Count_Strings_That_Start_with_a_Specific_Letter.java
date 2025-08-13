package com.project.coding_challenge_tasks.java8_handson_practice.basic_entry_level_questions;

import java.util.Arrays;
import java.util.List;

public class Count_Strings_That_Start_with_a_Specific_Letter
{
    public static void main(String[] args)
    {
        List<String> letter = Arrays.asList("Anu", "Sunil", "Ajay", "Steve", "Amit", "David");
        Long CountLetter = letter.stream().filter(letters -> letters.startsWith("A")).count();
        System.out.println(CountLetter);
    }
}
