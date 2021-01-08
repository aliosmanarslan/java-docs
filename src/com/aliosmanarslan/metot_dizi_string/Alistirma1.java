package com.aliosmanarslan.metot_dizi_string;

import java.util.Arrays;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 7.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: 100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını
 * rastgele olacak şekilde üretin. Bu işlemden sonra dizideki
 * elemanların ortalamasını hesaplayarak bu ortalamanın altında kaç
 * tane eleman olduğunu yazdırın.
 */

public class Alistirma1 {
    public static void main(String[] args) {

        int[] sayilar = new int[99];
        int toplam = 0;

        for(int i = 0; i < sayilar.length; i++){
            int random = (int)(Math.random() * 100);
            sayilar[i] = random;
            toplam += random;
        }
        Arrays.sort(sayilar);
        diziYazdir(sayilar);

        double ortalama = (double) toplam / sayilar.length;
        System.out.println("\nOrtalma: " + ortalama);

        int sayac = 0;
        for(int i = 0; i < sayilar.length; i++){
            if(sayilar[i] < ortalama)
                sayac++;
        }
        System.out.println("Ortalama altındaki değerlerin sayısı : " + sayac);


    }

    private static void diziYazdir(int[] sayilar) {
        for(int i : sayilar)
            System.out.print(i + " ");
    }
}
