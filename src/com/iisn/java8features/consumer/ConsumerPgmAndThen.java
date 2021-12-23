package com.iisn.java8features.consumer;

import java.util.function.Consumer;

public class ConsumerPgmAndThen {
    static Consumer<String> c=(n)->
    {
        System.out.println("Value of First Consumer is "+n.toUpperCase());
    };
    static Consumer<String> c1=(m)->
    {
        System.out.println("Value of Second Consumer is "+m.toLowerCase());
    };
    static Consumer<String> c2=(o)->
    {
        System.out.println("Value of Second Consumer is "+o);
    };
    public static void main(String[] args) {
        c.andThen(c1).andThen(c2).accept("JaVa PrOg");
    }
}
