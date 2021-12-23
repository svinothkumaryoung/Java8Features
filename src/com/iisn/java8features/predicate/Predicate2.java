package com.iisn.java8features.predicate;

import java.util.function.Predicate;

public class Predicate2 {
    static Predicate<Integer> p1=(b)->b>18 && 30>b;
    static Predicate<String> name=(n)->n.equals("Java8");
    public static void main(String[] args) {
        Boolean output=p1.test(40);
        Boolean output1=name.test("Java8");
        System.out.println("Output for First Predicate "+output);
        System.out.println("Output for Second Predicate "+output1);
    }
}
