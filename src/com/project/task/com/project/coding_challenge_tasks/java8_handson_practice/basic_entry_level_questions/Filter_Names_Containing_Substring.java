package com.project.coding_challenge_tasks.java8_handson_practice.basic_entry_level_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Names_Containing_Substring
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("David", "Steve", "Kevin", "Avinash", "Kiran");
        List<String> substringNames = names.stream().filter(n-> n.contains("vi")).collect(Collectors.toList());
        System.out.println(substringNames);
    }
}
