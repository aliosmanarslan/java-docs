package com.aliosmanarslan.azkod_cokis.kalitimsiz_ornek;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 9.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: yok
 */

public class KalitimsizOrnek {
    public static void main(String[] args) {

        Personel mudur = new Personel("Ahmet",123456,-8);
        System.out.println(mudur);

        Ogrenci ogr1 = new Ogrenci("Ali",15,789456,1046);
        System.out.println(ogr1);
    }
}

class Personel{
    private String isim;
    private long tcKimlik;
    private int yas;

    public Personel() {
        isim="Henüz atanmadı";
        tcKimlik = 0;
        yas = 18;
    }

    public Personel(String isim, long tcKimlik, int yas) {
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

class Ogrenci{

    private String isim;
    private int yas;
    private long tcKimlik;
    private int okulNo;

    public Ogrenci(String isim, int yas, long tcKimlik, int okulNo) {
        this.isim = isim;
        this.yas = yas;
        this.tcKimlik = tcKimlik;
        this.okulNo = okulNo;
    }

    public Ogrenci() {
        isim="Henüz atanmadı";
        tcKimlik = 0;
        setYas(yas);
        okulNo = 5000;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas >= 7)
            this.yas = yas;
        else
            this.yas = 7;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    @Override
    public String toString() {
        return "Ad:" + isim + " Tckimlik:" + tcKimlik + " Yas:" + yas + " Okul no:" + okulNo ;
    }
}
