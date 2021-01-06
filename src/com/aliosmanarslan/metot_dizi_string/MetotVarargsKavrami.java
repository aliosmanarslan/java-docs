package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 5.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Metot Varargs Kavramı
 */

public class MetotVarargsKavrami {
    public static void main(String[] args) {

        toplaminiBul(5,-7,2,-4,6,9,-5,1,28);
        toplaminiBul(2,3);
        toplaminiBul(1);

    }

    //dizi gibi davranıp maindeki sayıları "parametreListesi" indexine atıyor
    //sınırsız değer gönderebilirsin
    private static void toplaminiBul(int... parametreListesi) {
        int sonuc = 0;
        for(int toplami : parametreListesi){
            sonuc += toplami;
        }
        System.out.println("Toplamları " + sonuc);
        System.out.println("parametreListesinin birinci elemanı " + parametreListesi[0] + " \n");
    }
}
