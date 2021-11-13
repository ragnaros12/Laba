package com.company.Nine;

import java.util.Objects;

public class Cafedra {
    private int Room;
    private int Corps;
    private String Phone;
    private String NameZavCaf;
    private int ColTeach;

    public Cafedra(int room, int corps, String phone, String nameZavCaf, int colTeach) {
        Room = room;
        Corps = corps;
        Phone = phone;
        NameZavCaf = nameZavCaf;
        ColTeach = colTeach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cafedra cafedra = (Cafedra) o;
        return Room == cafedra.Room && Corps == cafedra.Corps && ColTeach == cafedra.ColTeach && Objects.equals(Phone, cafedra.Phone) && Objects.equals(NameZavCaf, cafedra.NameZavCaf);
    }
}
