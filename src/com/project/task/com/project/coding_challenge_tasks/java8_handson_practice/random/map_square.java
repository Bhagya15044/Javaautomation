package com.project.coding_challenge_tasks.java8_handson_practice.random;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class map_square
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4);
        List<Integer> squareList = list.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(squareList);
    }
}
