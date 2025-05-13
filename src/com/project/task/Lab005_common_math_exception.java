package com.project.task;

public class Lab005_common_math_exception
{
    public static void main(String[] args)
    {
        System.out.println(10/0); // if anything divide by zero we will get Arthimetic exception
    }
}
/*
"C:\Program Files\Java\jdk-23\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1\lib\idea_rt.jar=63305" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\kisho\IdeaProjects\Java automation\out\production\Java automation" com.project.task.Lab005_common_math_exception
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.project.task.Lab005_common_math_exception.main(Lab005_common_math_exception.java:7)

Process finished with exit code 1
 */