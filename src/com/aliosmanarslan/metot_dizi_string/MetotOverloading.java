package com.aliosmanarslan.metot_dizi_string;

import java.util.Scanner;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: MetotOrnek
 */

public class MetotOverloading {
    public static void main(String[] args) {

        int gelenSecim = menuGoster();

            if(gelenSecim == 1 || gelenSecim == 2 || gelenSecim == 3 || gelenSecim == 4) {

                Scanner tara = new Scanner(System.in);
                System.out.println("Birinci sayıyı giriniz : ");
                int birinciSayi = tara.nextInt();
                System.out.println("İkinci sayıyı giriniz : ");
                int ikinciSayi = tara.nextInt();

                switch (gelenSecim) {
                    case 1:
                        ikiSayininToplami(birinciSayi,ikinciSayi);
                        break;
                    case 2:
                        int carpim = ikiSayininCarpimi(birinciSayi,ikinciSayi);
                        System.out.println("Sayıların çarpımı : " + carpim);
                        break;
                    case 3:
                        sayininKuvvetiniAl(birinciSayi, ikinciSayi);
                        break;
                    case 4:
                        double carpimDouble = ikiSayininCarpimi(8.6,5.3,7.5);
                        System.out.println("İki double sayının çarpımı : " + (carpimDouble));
                        break;
                }
            }else return;
        }

    //Metot overloading - metot aşırı yükleme
    public static int ikiSayininCarpimi(int birinciSayi, int ikinciSayi) {
        int toplam = birinciSayi * ikinciSayi;
        return toplam;
    }

    //Metot overloading - metot aşırı yükleme
    public static double ikiSayininCarpimi(double birinciSayi, double ikinciSayi, double ucuncuSayi) {
        double toplam = birinciSayi * ikinciSayi * ucuncuSayi;
        return toplam;
    }

    public static void ikiSayininToplami(int birinciSayi, int ikinciSayi) {
        System.out.println("İki sayının toplamı : " + (birinciSayi+ikinciSayi));
    }

    private static void sayininKuvvetiniAl(int birinciSayi, int ikinciSayi) {
        double sonuc = Math.pow(birinciSayi,ikinciSayi);
        System.out.println("Sayıların kuvveti : " + sonuc);
    }

    public static int menuGoster(){
        System.out.println("******* MENU *******");
        System.out.println("1 - İki sayının toplamlarını bul");
        System.out.println("2 - İki sayının çarpımlarını bul");
        System.out.println("3 - İki sayının kuvvetini bul");
        System.out.println("4 - İki double sayının çarpımını bul");
        System.out.println("0 - Çıkmak için basınız");

        Scanner tara = new Scanner(System.in);
        int secim = tara.nextInt();
        return secim;

    }
}
