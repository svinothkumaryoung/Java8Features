package com.iisn.java8features.biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerAndThenPgm {
    static BiConsumer<Integer,String> bc=(n, m)->
    {
        System.out.println("Name is "+ m +"Age is "+n );
    };
    static BiConsumer<Integer,String> bc1=(n, m)->
    {
        System.out.println("Name is "+ m +"Age is "+n );
    };
    public static void main(String[] args) {
        bc.andThen(bc1).accept(18,"Vinothkumar Selvaarasan");
    }
}
