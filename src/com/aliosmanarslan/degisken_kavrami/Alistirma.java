package com.aliosmanarslan.degisken_kavrami;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Soru çözümleri
 */
public class Alistirma {
    public static void main(String[] args) {

        //Alıştırma 1
        String stringSayi = "115";
        int tamSayi = Integer.parseInt(stringSayi);
        int tamSayi2 = Integer.valueOf(stringSayi);

        System.out.println("Tam Sayı Değerim : " + tamSayi);
        System.out.println("Tam Sayı Değerim : " + tamSayi2);

        stringSayi = String.valueOf(tamSayi);
        System.out.println("String Değerim : " + stringSayi);

        System.out.println("************************************************");

        //Alıştırma 2
        int sayi1 = 5 / 3;
        float sayi2 = 5F / 3f;
        double sayi3 = 5d / 3D;

        System.out.println("Sayı1 : " + sayi1);
        System.out.println("Sayı2 : " + sayi2);
        System.out.println("Sayı3 : " + sayi3);

        System.out.println("************************************************");

        //Alıştırma 3
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1.0 - 0.9);

        System.out.println("************************************************");

        //Alıştırma 4

        int s1 = 1;
        int s2 = 2;

        double ortalama1 = (s1 + s2) / 2; //2d yapınca doğru sonucu verecektir.
        System.out.println("Ortalama 1 : " + ortalama1);

        double ortalama2 = (s1 + s2) / 2.0;
        System.out.println("Ortalama 2 : " + ortalama2);

        double ortalama3 = (double) (s1 + s2) / 2;
        System.out.println("Ortalama 1 : " + ortalama3);

    }
}
