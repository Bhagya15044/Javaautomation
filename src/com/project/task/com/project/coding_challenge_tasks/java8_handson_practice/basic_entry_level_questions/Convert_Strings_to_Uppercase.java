package com.project.coding_challenge_tasks.java8_handson_practice.basic_entry_level_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_Strings_to_Uppercase
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("apple", "banana", "grape", "orange");
        List<String> uppercaseLetters = words.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercaseLetters);
    }
}
