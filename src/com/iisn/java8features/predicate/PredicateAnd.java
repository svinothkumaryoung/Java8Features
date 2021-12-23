package com.iisn.java8features.predicate;

import java.util.function.Predicate;

public class PredicateAnd {
    static Predicate<Integer> p1=(n)->n>18;
    static Predicate<Integer> p2=(n)->60>n;

    public static void main(String[] args) {
        boolean output=p1.and(p2).test(30);
        System.out.println("Is Age Statisfied to watch Movie "+output);
    }
}
