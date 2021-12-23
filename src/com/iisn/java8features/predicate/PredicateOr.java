package com.iisn.java8features.predicate;

import java.util.function.Predicate;

public class PredicateOr {
    static Predicate<Integer> p1=(n)->n>15;
    static Predicate<Integer> p2=(n)->60>n;

    public static void main(String[] args) {
        boolean output=p1.or(p2).test(0);
        System.out.println("Is Age Statisfied to drink tea "+output);
    }
    //Task : Negate and isEqual
}
