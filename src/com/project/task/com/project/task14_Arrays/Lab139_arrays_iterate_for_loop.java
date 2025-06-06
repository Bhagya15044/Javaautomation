package com.project.task14_Arrays;

public class Lab139_arrays_iterate_for_loop 
{
    public static void main(String[] args) 
    {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9} };

        for (int i = 0; i < matrix.length ; i++) // this is for rows
        {
            for (int j = 0; j < matrix[i].length ; j++) // this is for columns
            {
                //System.out.print(matrix[i][j]); it will print numbers pattern
                System.out.print("*"); // it will print the start pattern
            }
            System.out.println(); // this is for space
        }
    }
}
