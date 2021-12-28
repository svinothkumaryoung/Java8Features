package com.iisn.java8features.model;

public class StudentInfo {
    private int registerNo;
    private String name;
    private String Address;
    private String city;
    private String Country;
    private int ZipCode;

    public StudentInfo() {
    }

    public StudentInfo(int registerNo, String name, String address, String city, String country, int zipCode) {
        this.registerNo = registerNo;
        this.name = name;
        Address = address;
        this.city = city;
        Country = country;
        ZipCode = zipCode;
    }

    public int getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int zipCode) {
        ZipCode = zipCode;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "registerNo=" + registerNo +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", city='" + city + '\'' +
                ", Country='" + Country + '\'' +
                ", ZipCode=" + ZipCode +
                '}';
    }
}
