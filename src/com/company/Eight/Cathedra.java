package com.company.Eight;

public class Cathedra {
    private String NameChair;
    private int Room;
    private int Corps;
    private String Phone;
    private String NameZavCaf;
    private int ColTeach;

    public Cathedra(String nameChair, int room, int corps, String phone, String nameZavCaf, int colTeach) {
        NameChair = nameChair;
        Room = room;
        Corps = corps;
        Phone = phone;
        NameZavCaf = nameZavCaf;
        ColTeach = colTeach;
    }

    @Override
    public String toString() {
        return "Cathedra{" +
                "NameChair='" + NameChair + '\'' +
                ", Room=" + Room +
                ", Corps=" + Corps +
                ", Phone='" + Phone + '\'' +
                ", NameZavCaf='" + NameZavCaf + '\'' +
                ", ColTeach=" + ColTeach +
                '}';
    }

    public String getNameChair() {
        return NameChair;
    }

    public void setNameChair(String nameChair) {
        NameChair = nameChair;
    }

    public int getRoom() {
        return Room;
    }

    public void setRoom(int room) {
        Room = room;
    }

    public int getCorps() {
        return Corps;
    }

    public void setCorps(int corps) {
        Corps = corps;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getNameZavCaf() {
        return NameZavCaf;
    }

    public void setNameZavCaf(String nameZavCaf) {
        NameZavCaf = nameZavCaf;
    }

    public int getColTeach() {
        return ColTeach;
    }

    public void setColTeach(int colTeach) {
        ColTeach = colTeach;
    }
}
