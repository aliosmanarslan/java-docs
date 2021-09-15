package com.aliosmanarslan.azkod_cokis.kalitimli_ornek;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 9.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: no
 */

public class KalitimliOrnek {
    public static void main(String[] args) {

        Personel mudur = new Personel("Ahmet",123456,40,"müdür");
        System.out.println(mudur);

        Ogrenci ali = new Ogrenci("Ali",1234567,23,1046);
        System.out.println(ali);

        MezunOgrenci osman = new MezunOgrenci("Osman",789455,22,2050,"Ruh ve sinir hastalıkları");
        System.out.println(osman);
    }
}

class Kisi{
    private String isim;
    private long tcKimlik;
    private int yas;

    public Kisi() {
        isim="Henüz atanmadı";
        tcKimlik = 0;
        yas = 18;
    }

    public Kisi(String isim, long tcKimlik, int yas) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
        setYas(yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas >= 18)
            this.yas = yas;
        else
            this.yas = 18;
    }

    @Override
    public String toString() {
        return "Ad:" + isim + " Tckimlik:" + tcKimlik + " Yas:" + yas;
    }
}

class Personel extends Kisi{

    private String pozisyon;

    public Personel(String isim, long tcKimlik, int yas, String pozisyon) {
//        setYas(yas);
//        setIsim(isim);
//        setTcKimlik(tcKimlik);
        super(isim,tcKimlik,yas);
        this.pozisyon = pozisyon;
    }

    public String getPozisyon(){
        return pozisyon;
    }
    public void setPozisyon(String pozisyon){
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Ad:" + getIsim() + " Tckimlik:" + getTcKimlik() + " Yas:" + getYas() + " Pozisyon:" + pozisyon;
    }
}

class Ogrenci extends Kisi{
    private int ogrenciNo;

    public Ogrenci(String isim, long tcKimlik, int yas, int ogrenciNo) {
        setYas(yas);
        setIsim(isim);
        setTcKimlik(tcKimlik);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ad:" + getIsim() + " Tckimlik:" + getTcKimlik() + " Yas:" + getYas() + " Ogrenci No:" + ogrenciNo;
    }
}

class MezunOgrenci extends  Ogrenci{

    private String calismaYeri;

    public MezunOgrenci(String isim, long tcKimlik, int yas, int ogrenciNo, String calismaYeri) {
        super(isim, tcKimlik, yas, ogrenciNo);
        this.calismaYeri = calismaYeri;
    }

    public String getCalismaYeri() {
        return calismaYeri;
    }

    public void setCalismaYeri(String calismaYeri) {
        this.calismaYeri = calismaYeri;
    }

    @Override
    public String toString() {
        return "Ad:" + getIsim() + " Tckimlik:" + getTcKimlik() + " Yas:" + getYas() + " Ogrenci No:" + getOgrenciNo() + " Çalışma yeri: " + calismaYeri;
    }
}