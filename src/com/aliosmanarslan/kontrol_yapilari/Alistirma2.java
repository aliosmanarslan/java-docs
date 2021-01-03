package com.aliosmanarslan.kontrol_yapilari;

import java.util.Scanner;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Rasgele üretilen sayının basamaklarını tahmin eden oyun örneği
 */

public class Alistirma2 {
    public static void main(String[] args) {

        double rasgeleSayi = Math.random() * 90 + 10;
        System.out.println("Üretilen rasgele sayı: " + rasgeleSayi);

        Scanner klavye = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int kullaniciTahmin = klavye.nextInt();

        int birinciBasamak = kullaniciTahmin / 10;
        int ikinciBasamak = kullaniciTahmin % 10;

        int rasgeleSayiBirinciBasamak = (int) rasgeleSayi / 10;
        int rasgeleİkinciBasamak = (int) rasgeleSayi % 10;


        if(kullaniciTahmin == (int)rasgeleSayi)
            System.out.println("Tebrikler 10000 TL kazandınız.");
        else if (birinciBasamak == rasgeleİkinciBasamak && ikinciBasamak == rasgeleSayiBirinciBasamak)
            System.out.println("İki basamağı tahmin ettiniz 5000 TL");
        else if (birinciBasamak == rasgeleİkinciBasamak || birinciBasamak == rasgeleSayiBirinciBasamak
                || ikinciBasamak == rasgeleİkinciBasamak || ikinciBasamak  == rasgeleSayiBirinciBasamak)
            System.out.println("Bir basamağı tahmin ettiniz 1000 TL");
        else
            System.out.println("Şanslı Değilsin 0 TL");

    }
}

