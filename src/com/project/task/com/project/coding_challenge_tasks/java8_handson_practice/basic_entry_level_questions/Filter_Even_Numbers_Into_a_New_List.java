package com.project.coding_challenge_tasks.java8_handson_practice.basic_entry_level_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Even_Numbers_Into_a_New_List
{
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> even_num = num.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even_num);
    }
}
