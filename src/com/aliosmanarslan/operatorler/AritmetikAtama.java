package com.aliosmanarslan.operatorler;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: AritmetikAtama
 */
public class AritmetikAtama {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;

        int sonuc = 0;

        // sonuc = sonuc + sayi1;
        sonuc += sayi1;
        System.out.println("Sonuç : " + sonuc);

        // sonuc = sonuc - sayi1;
        sonuc -= sayi2;
        System.out.println("Sonuç2 : " + sonuc);

        // sonuc = sonuc * sayi1;
        sonuc *= sayi2;
        System.out.println("Sonuç3 : " + sonuc);

        // sonuc = sonuc / sayi1;
        sonuc /= sayi1;
        System.out.println("Sonuç4 : " + sonuc);

    }
}
