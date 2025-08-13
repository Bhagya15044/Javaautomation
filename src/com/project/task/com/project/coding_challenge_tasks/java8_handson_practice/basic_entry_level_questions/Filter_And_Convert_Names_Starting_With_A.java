package com.project.coding_challenge_tasks.java8_handson_practice.basic_entry_level_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_And_Convert_Names_Starting_With_A
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Anu", "Ajay", "Steve", "Amit", "Sunil", "David");
        List<String> Filtered_names = names.stream().filter(n->n.startsWith("A")).map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(Filtered_names);
    }
}
