package com.aliosmanarslan.operatorler;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: ArttirmaAzaltma
 */
public class ArttirmaAzaltma {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = ++sayi1; // sayi1 11 oldu ( genel ) , sayi2 11 oldu
        int sayi3 = sayi1--; // sayi1 10 oldu ( genel ) , sayi3 11 oldu
        int sayi4 = sayi1--; // sayi1 9 oldu ( genel )  , sayi4 10 oldu

        System.out.println("Sonuç : " + (sayi1) + " " + (--sayi2) + " " + (sayi3--) + " " + (sayi4));

    }
}