package com.project.task18_real_example_single_inheritance;

public class Lab162_testcase1 extends Lab164_common_to_all_test_cases
{
 // here we used extends keyword to extend all the methods and functions from common to all test cases class.
    void runningTestcase1()
    {
        start_browser();
        System.out.println("running testcase1");
        close_browser();
    }
}
