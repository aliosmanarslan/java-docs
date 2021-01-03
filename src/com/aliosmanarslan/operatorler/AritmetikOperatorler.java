package com.aliosmanarslan.operatorler;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: AritmetikOperatorler
 */
public class AritmetikOperatorler {
    public static void main(String[] args) {

        int sayi1 = 60;
        int sayi2 = 40;

        System.out.println("Sayı1 : " + sayi1 + "Sayı2 : " + sayi2 + "Toplamları : " + (sayi1 + sayi2));
        System.out.println("Sayı1 : " + sayi1 + "Sayı2 : " + sayi2 + "Farkları : " + (sayi1 - sayi2));
        System.out.println("Sayı1 : " + sayi1 + "Sayı2 : " + sayi2 + "Çarpımları : " + (sayi1 * sayi2));
        System.out.println("Sayı1 : " + sayi1 + "Sayı2 : " + sayi2 + "Bölümleri : " + ((double)sayi1 / (double)sayi2));
        System.out.println("Sayı1 : " + sayi1 + "Sayı2 : " + sayi2 + "Modu : " + (sayi1 % sayi2));

    }
}

