package com.learnJava.functionalInterfaces;

public class FunctionExample1 {
    public static String performConcat (String str){
        // lambda expression is meant for
        // - reusability
        // - readability
        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {
        String result = performConcat("Hello");
        System.out.println("Result : " + result);
    }
}
