package com.iisn.java8features.model;

import com.iisn.java8features.model.StudentInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataLayer {

    public static List<StudentInfo>  addStudentData()
    {
        StudentInfo si1=new StudentInfo( 1001,  "Sharan",  "Chennai",  "Chennai",  "India",  600060);
        StudentInfo si2=new StudentInfo( 1002,  "Sharanish",  "Chengalpatu",  "Chengalpatu",  "India",  600050);
        StudentInfo si3=new StudentInfo( 1003,  "Gokul",  "Madurai",  "Madurai",  "India",  621010);
        StudentInfo si4=new StudentInfo( 1004,  "Vinoth",  "Chennai",  "Chennai",  "India",  600060);

        return Arrays.asList(si1,si2,si3,si4);
    }


}
