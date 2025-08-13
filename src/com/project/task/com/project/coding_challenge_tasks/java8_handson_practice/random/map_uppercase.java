package com.project.coding_challenge_tasks.java8_handson_practice.random;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class map_uppercase
{
    public static void main(String[] args)
    {
        List<String> letters = Arrays.asList("ball","cat","milk","umbrella","bottle");
        List<String> uppercaseLetters = letters.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(uppercaseLetters);
    }
}
