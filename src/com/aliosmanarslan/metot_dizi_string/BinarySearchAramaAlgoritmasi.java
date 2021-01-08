package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 7.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Binary Search Arama Algoritması ile Dizide Eleman Arama
 */

public class BinarySearchAramaAlgoritmasi {
    public static void main(String[] args) {
        int[] dizi = {0,2,3,5,-9,12,15,20,30,40,50};
        
        int aranaSayi = binarySearch(dizi,-9);
        System.out.println("sonuc :" + aranaSayi);
    }

    private static int binarySearch(int[] dizi, int aranacakEleman) {

        int enDusukIndex = 0;
        int enYuksekIndex = dizi.length - 1;

        while (enYuksekIndex >= enDusukIndex) {

            int ortaIndex = (enDusukIndex + enYuksekIndex) / 2;

            if (dizi[ortaIndex] > aranacakEleman) {
                enYuksekIndex = ortaIndex - 1;

            } else if (aranacakEleman == dizi[ortaIndex]) {
                return ortaIndex;
            } else {
                enDusukIndex = ortaIndex + 1;
            }
        }
        return -enDusukIndex - 1;
    }
}
