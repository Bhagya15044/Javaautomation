package com.project.task14_Arrays;

public class Lab128_min_value_array
{
    public static void main(String[] args)
{
    int [] array = {12,23,45,67,89,76,54,34,21};
//    int min_number = give_min_element(array);
    int min_number = array[0];
    for(int i = 0;i<array.length; i++)
        {
            if(array[i]<min_number)
            {
                min_number = array[i];
            }
        }

    System.out.println("min value is " + min_number);

}

//    static  int give_min_element(int[]array)
//    {
//        int min = array[0];
//
//        for(int i = 0;i<array.length; i++)
//        {
//            if(array[i]<min)
//            {
//                min = array[i];
//            }
//        }
//        return min;
    }


