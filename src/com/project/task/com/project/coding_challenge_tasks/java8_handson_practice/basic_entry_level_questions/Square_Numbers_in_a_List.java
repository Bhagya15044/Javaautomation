package com.project.coding_challenge_tasks.java8_handson_practice.basic_entry_level_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square_Numbers_in_a_List
{
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(2,3,4,5);
        List<Integer> square_numbers = num.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(square_numbers);
    }
    //The candidate explored built-in options first (Math.square()), realized it's not available, and then used lambda transformation.
}