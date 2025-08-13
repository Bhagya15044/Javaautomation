package com.project.coding_challenge_tasks.java8_handson_practice.random;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap
{
        public static void main(String[] args) {
            List<List<String>> nestedList = Arrays.asList(
                    Arrays.asList("A", "B"),
                    Arrays.asList("C", "D"),
                    Arrays.asList("E", "F")
            );

            List<String> flatList = nestedList.stream()
                    .flatMap(innerList -> innerList.stream())
                    .collect(Collectors.toList());

            System.out.println(flatList);  // Output: [A, B, C, D, E, F]
        }
    }

