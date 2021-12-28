package com.iisn.java8features.predicate;

import com.iisn.java8features.model.DataLayer;
import com.iisn.java8features.model.StudentInfo;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStream {

    static Predicate<StudentInfo> predicate=(s1)->s1.getZipCode()==600060;
    static Predicate<StudentInfo> predicate1=(s2)->s2.getCountry().equals("India");

    public static void main(String[] args) {
        List<StudentInfo> si= DataLayer.addStudentData();
        si.stream()
                .filter(predicate1)
                .filter(predicate)
                .forEach(System.out::println);

    }
}
