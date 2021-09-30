/**
 * 1972015 Andreas Yoseph Liandy
 * 1972037 Gabriel Octa Mahardika
 * 1972046 Jhonathan Oktavianus
 */

package com.example.tugaspertemuan3_1972015_1972037_1972046;

public class Student {

    private String nama;
    private double KAT;
    private double UAS;
    private double UTS;
    private double rata;

    public Student() {
    }


    public Student(String nama, int KAT, int UAS, int UTS) {
        this.nama = nama;
        this.KAT = KAT;
        this.UAS = UAS;
        this.UTS = UTS;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getKAT() {
        return KAT;
    }

    public void setKAT(double KAT) {
        this.KAT = KAT;
    }

    public double getUAS() {
        return UAS;
    }

    public void setUAS(double UAS) {
        this.UAS = UAS;
    }

    public double getUTS() {
        return UTS;
    }

    public void setUTS(double UTS) {
        this.UTS = UTS;
    }

    public String getStringKAT() {
        return String.valueOf(getKAT());
    }

    public String getStringUTS() {
        return String.valueOf(getUTS());
    }

    public String getStringUAS() {
        return String.valueOf(getUAS());
    }

    public String getStringRata() {
        return String.valueOf(getRata());
    }

    public double getRata() {
        double rata = (0.5 * getKAT()) + (0.25 * getUTS()) + (0.25 * getUAS());
        return rata;
    }
}