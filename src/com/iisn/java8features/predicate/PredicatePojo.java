package com.iisn.java8features.predicate;

import com.iisn.java8features.model.DataLayer;
import com.iisn.java8features.model.StudentInfo;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePojo {
    static Predicate<StudentInfo> predicate=(s1)->s1.getZipCode()==600060;

    public static void main(String[] args) {
        List<StudentInfo> si= DataLayer.addStudentData();
       System.out.println(predicate.test(si.get(0)));
    }
}
