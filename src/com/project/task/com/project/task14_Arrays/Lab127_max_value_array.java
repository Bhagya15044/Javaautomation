package com.project.task14_Arrays;

public class Lab127_max_value_array
{
    public static void main(String[] args)
    {
        int [] array = {12,23,45,67,89,76,54,34,21};
//        int max_number = give_max_element(array);

        int max_number = array[0];
        for(int i = 0;i<array.length; i++)
        {
            if(array[i]>max_number)
            {
                max_number = array[i];
            }
        }

        System.out.println("max value is " + max_number);

    }

//    static  int give_max_element(int[]array)
//    {
//        int max = array[0];
//
//        for(int i = 0;i<array.length; i++)
//        {
//            if(array[i]>max)
//            {
//                max = array[i];
//            }
//        }
//        return max;
//    }
}

