package com.project.coding_challenge_tasks.java8_handson_practice.basic_entry_level_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Names_With_Length_greaterthan_4
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Anu", "Sunil", "David", "Ram", "Steve", "Ajay");
        List<String> name = names.stream().filter(s -> s.length()>4).collect(Collectors.toList());
        System.out.println(name);
    }
}
