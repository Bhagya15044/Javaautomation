package com.project.coding_challenge_tasks.java8_handson_practice.random;

import jdk.dynalink.linker.LinkerServices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter_even
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even_num = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even_num);
    }
}
