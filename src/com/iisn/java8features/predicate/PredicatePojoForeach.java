package com.iisn.java8features.predicate;

import com.iisn.java8features.model.DataLayer;
import com.iisn.java8features.model.StudentInfo;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePojoForeach {
    static Predicate<StudentInfo> predicate=(s1)->s1.getZipCode()==600060;
    static Predicate<StudentInfo> predicate1=(s2)->s2.getCountry().equals("India");

    public static void main(String[] args) {
        List<StudentInfo> si= DataLayer.addStudentData();
        si.forEach(s->
        {
            if(predicate.or(predicate1).test(s))
            {
                System.out.println(s);
            }
            else
            {
                System.out.println("No Record Found ");
            }
        });
    }

}
