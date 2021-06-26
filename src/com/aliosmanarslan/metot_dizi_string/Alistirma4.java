package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 29.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Ebob-Ekok
 */

public class Alistirma4 {
    public static void main(String[] args) {
        int birinciSayi = 30, ikinciSayi = 12;

        ekokBul(birinciSayi,ikinciSayi);
        ebobBul(birinciSayi,ikinciSayi);
    }

    private static void ebobBul(int birinciSayi, int ikinciSayi) {
        for(int i = ikinciSayi; i > 0; i--){
            if(ikinciSayi % i == 0){
                if(birinciSayi % i == 0){
                    System.out.println("Ebob: " + i);
                    return;
                }
            }
        }
    }

    private static void ekokBul(int birinciSayi, int ikinciSayi) {
        for(int i = 1; i<ikinciSayi; i++){
            int ekokHesapla= birinciSayi * i;
            if(ekokHesapla % ikinciSayi == 0) {
                System.out.println("Ekok: " + (ekokHesapla));
                return;
            }
        }
    }
}
