package com.learnJava.methodReference;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
//    static Consumer<Student> c1 = p -> System.out.println(p);

    /*
    classname:methodName
     */
    static Consumer<Student> c1 = System.out::println;

    /*
    Classname:instanceMethodName
     */
    static Consumer<Student> c2 = Student::printListOfActivities;


    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
