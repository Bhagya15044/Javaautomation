package com.project.coding_challenge_tasks.java8_handson_practice.basic_entry_level_questions;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Names_Starting_With_S {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sunil", "David", "Steve", "Ajay", "Sam", "Anu");
        List<String> Filterednames = names.stream().filter(value -> value.startsWith("S")).collect(Collectors.toList());
        System.out.println(Filterednames);
    }
}
