package com.aliosmanarslan.oop_giris;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 29.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Oop Giriş
 */

public class OopGirisKavramlar {
    public static void main(String[] args) {

        Ogrenci[] ogrenciler = new Ogrenci[500];

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.ogrenciNo = 1046;
        ogrenci1.isim = "Ali Osman ARSLAN";
        ogrenci1.sinif = 4;
        ogrenci1.aktif = true;
        ogrenci1.ogrenciBilgileriniYazdir();

        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.ogrenciNo = 1851;
        ogrenci2.isim = "Hasan";
        ogrenci2.sinif = 3;
        ogrenci2.aktif = false;
        ogrenci2.ogrenciBilgileriniYazdir();

        Ogrenci bos = new Ogrenci();
        bos.ogrenciBilgileriniYazdir();

        Ogrenci ogrenci3 = new Ogrenci(123,"Ayşe", (byte) 2,true);
        ogrenci3.ogrenciBilgileriniYazdir();

        ogrenciler[0] = ogrenci1;
        ogrenciler[1] = ogrenci2;
        ogrenciler[2] = ogrenci3;
        ogrenciler[3] = new Ogrenci(456,"yusuf",(byte) 1,true);

        ogrenciler[2].sinif = 4;
        ogrenciler[2].ogrenciBilgileriniYazdir();
        ogrenciler[3].ogrenciBilgileriniYazdir();

    }
}
