package com.iisn.java8features.consumer;

import com.iisn.java8features.model.DataLayer;
import com.iisn.java8features.model.StudentInfo;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPojo {
    static Consumer<StudentInfo> studentInfo=(n)->
    {
        System.out.println("Value User Passing is "+n.getCountry().toUpperCase());
    };

    public static void main(String[] args) {
        List<StudentInfo> studentInfos= DataLayer.addStudentData();
        //System.out.println(studentInfos);
       studentInfo.accept(studentInfos.get(0));
    }
}
