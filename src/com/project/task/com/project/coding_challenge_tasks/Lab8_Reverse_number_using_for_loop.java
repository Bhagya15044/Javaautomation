package com.project.coding_challenge_tasks;

import java.util.Scanner;
public class Lab8_Reverse_number_using_for_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you like!!");
        int num = scanner.nextInt();

        if (num >= 10) { // Check for at least 2 digits
            int reverse_num = 0;
            for (int n = num; n > 0; n = n / 10) {
                int digit = n % 10;
                reverse_num = reverse_num * 10 + digit;
            }
            System.out.println("Final reversed number: " + reverse_num);
        } else {
            System.out.println("Please enter a number with at least two digits.");
        }
    }
}
/*
    for loop iteration printing flow table :
    ---------------------------------------
                 🔄 Iteration Details:
                 --------------------
Iteration	n	 digit = n % 10	 reverse_num = reverse_num * 10 + digit	  Printed
1	       12345	   5	           0 * 10 + 5 = 5	                    5
2	       1234        4	           5 * 10 + 4 = 54                   	54
3	       123	       3	           54 * 10 + 3 = 543                    543
4	       12	       2	           543 * 10 + 2 = 5432	                5432
5	       1	       1	           5432 * 10 + 1 = 54321	            54321
6          0	   	Loop ends

✅ Final Output (if printed each step):
--------------------------------------
5
54
543
5432
54321

 */
