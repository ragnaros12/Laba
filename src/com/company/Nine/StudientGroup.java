package com.company.Nine;

import java.util.Date;

public class StudientGroup {
    private String NameGroup;
    private Date Year;
    private Cafedra cafedra;

    public StudientGroup(String nameGroup, Date year, Cafedra cafedra) {
        NameGroup = nameGroup;
        Year = year;
        this.cafedra = cafedra;
    }

    public String getNameGroup() {
        return NameGroup;
    }

    public void setNameGroup(String nameGroup) {
        NameGroup = nameGroup;
    }

    public Date getYear() {
        return Year;
    }

    public void setYear(Date year) {
        Year = year;
    }

    public Cafedra getCafedra() {
        return cafedra;
    }

    public void setCafedra(Cafedra cafedra) {
        this.cafedra = cafedra;
    }
}
