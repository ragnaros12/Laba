package com.company.Nine;

public class Teacher {
    private Cafedra cafedra;
    private String FIO;
    private String Dolz;
    private int Stage;
    private String Subjects;

    public Teacher(Cafedra cafedra, String FIO, String dolz, int stage, String subjects) {
        this.cafedra = cafedra;
        this.FIO = FIO;
        Dolz = dolz;
        Stage = stage;
        Subjects = subjects;
    }

    public Cafedra getCafedra() {
        return cafedra;
    }
}
