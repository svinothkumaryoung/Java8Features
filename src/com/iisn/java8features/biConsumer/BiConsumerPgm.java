package com.iisn.java8features.biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerPgm {

    static BiConsumer<Integer,String> bc=(n,m)->
    {
        System.out.println("Name is "+ m +"Age is "+n );
    };

    public static void main(String[] args) {
       bc.accept(18,"Vinothkumar Selvaarasan");
    }
}

