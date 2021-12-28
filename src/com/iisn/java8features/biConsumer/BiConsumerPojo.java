package com.iisn.java8features.biConsumer;

import com.iisn.java8features.model.DataLayer;
import com.iisn.java8features.model.StudentInfo;

import java.util.List;
import java.util.function.BiConsumer;
public class BiConsumerPojo {
    static void printData()
    {
        BiConsumer<String,String> biConsumer=(n,m)->
        {
            System.out.println("Name "+n +" Country  "+ m);

        };
        List<StudentInfo> studentInfos= DataLayer.addStudentData();
        studentInfos.forEach((s)->{
            biConsumer.accept(s.getName(),s.getCountry());
        });
    }
    public static void main(String[] args) {
        printData();
    }
}
