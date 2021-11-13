package com.company.Nine;

public class Student {
    private Cafedra cafedra;
    private String FIO;
    private String group;
    private String Male;
    private String Address;

    public Student(Cafedra cafedra, String FIO, String group, String male, String address) {
        this.cafedra = cafedra;
        this.FIO = FIO;
        this.group = group;
        Male = male;
        Address = address;
    }

    public Cafedra getCafedra() {
        return cafedra;
    }
}
