package com.project.task26_Abstraction;

public class Lab199_interview_Qna
{

}
interface I11
{

}
interface I12
{

}
class A1
{

}
class B1
{

}
class test extends B1
{

}
//class  test1 extends A1, B1
//{
//    invalid because multiple inheritance are allowed java
//    if we want to achieve multiple inheritance
//    it is possible through interface.
//}

class test2 implements I11, I12
{
    // multiple interfaces are  allowed
}
//class test3 implements  A1
//{
//    // class <--> class cannot be possible to implement
//    // class to interface is possible to implement
//}

class  test3 extends A1 implements I12
{
    // extending class from another class and that extended class can be implemented using interfaces.
}

//class  test4 implements I11 extends A1
//{
//    // first implementation and then extend it not possible
//    // first extends and then implementation is possible.
//}

//interface I3 extends A1
//{
//    // not possible
//}