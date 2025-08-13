package com.project.coding_challenge_tasks.java8_handson_practice.random;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap_usage
{
    public static void main(String[] args)
    {
        List<List<String>> nestedlist = Arrays.asList(
                Arrays.asList("A","B"),
                Arrays.asList("C","D"),
                Arrays.asList("E","F"));

        List<String> flattenedList = nestedlist.stream().flatMap(singlelist->singlelist.stream()).collect(Collectors.toList());
        System.out.println(flattenedList);
    }
}
