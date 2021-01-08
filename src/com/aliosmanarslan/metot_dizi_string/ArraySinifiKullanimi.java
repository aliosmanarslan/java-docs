package com.aliosmanarslan.metot_dizi_string;


import java.util.Arrays;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 7.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Arrays Sınıfı ve Önemli Metotları
 */

public class ArraySinifiKullanimi {
    public static void main(String[] args) {
        int[] dizi = {4,9,2,5,-4,-2,6,-8};
        int[] dizi2 = {4,9,2,5,-4,-2,6,-8};
        diziYazdir(dizi);

        //Arrays.sort küçükten büyüğe doğru sıralama metotu
        Arrays.sort(dizi);
        //Arrays.sort(dizi,0,6); // 0.indexten dahil, 6.index e kadar sırala ( 6 hariç)
        diziYazdir(dizi);

        //binarySearch için öncesinde sıralam işlemi yapılması gerekir
        int sonuc = Arrays.binarySearch(dizi,2);
        System.out.println("Aranan elemanın indexi : " + sonuc);

        System.out.println("**************************************");

        //Arrays.equals dizilerin aynı mı olduğunu true, false olarak verir
        System.out.println("Diziler eşit mi :" + Arrays.equals(dizi,dizi2));
        Arrays.sort(dizi2);
        System.out.println("Diziler eşit mi :" + Arrays.equals(dizi,dizi2));

        System.out.println("**************************************");

        //Arrays.fill dizinin içine değer atıyor
        int[] sayilar = new int[7];
        //Tek seferde tüm elemanlara 1 değerini ata
        Arrays.fill(sayilar,1);
        diziYazdir(sayilar);
        // 1.indexten dahil, 3.index e kadar elemanlara 25 değerini ata ( 3. index hariç)
        Arrays.fill(sayilar,1,3,25);
        diziYazdir(sayilar);

    }

    private static void diziYazdir(int[] dizi) {
        for(int i : dizi)
            System.out.print(i+" ");
        System.out.println();
    }

}
