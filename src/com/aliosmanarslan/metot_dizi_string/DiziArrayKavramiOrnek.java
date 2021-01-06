package com.aliosmanarslan.metot_dizi_string;

import java.util.Scanner;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 5.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Dizi ve Array Kavramına Ait 3 Örnek
 */

public class DiziArrayKavramiOrnek {
    public static void main(String[] args) {

        /*
        //Çözüm 1 - Dizideki sayıları ekrana yaz
        int[] sayilar = new int[10];    //Heap de tutulan alan
        for(int index = 0; index<sayilar.length; index++){
            sayilar[index] = (int) Math.pow(index,2);
            System.out.print(sayilar[index] + " ");
        }

        //Çözüm 2 - Hangi ayda olduğumu söyle
        String []aylar = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        Scanner aylarKlavye = new Scanner(System.in);
        System.out.println("\nLütfen hangi ayda olduğunuzu sayı ile giriniz");
        int sayiAylarKlavye = aylarKlavye.nextInt();

        System.out.println(aylar[sayiAylarKlavye - 1]);
        */

        //Çözüm 3 - Kullanıcının girdiği sayıların ortalamasını alma
        Scanner sayilarKlavye = new Scanner(System.in);
        System.out.println("Kaç sayının ortalamasını almak istiyorsunuz? : ");
        int alinanSayilar = sayilarKlavye.nextInt();

        int[] sayilar = new int[alinanSayilar];

        girilenSayilariAl(alinanSayilar,sayilar);

    }

    public static void girilenSayilariAl(int gelenSayi, int[] sayilar) {

        int ortalamaToplam = 1;

        for(int i = 0; i<gelenSayi; i++){
            Scanner alinanSayiKlavye = new Scanner(System.in);
            System.out.print((i+1) + ". Sayıyı giriniz :");
            int gecici = alinanSayiKlavye.nextInt();
            sayilar[i] = gecici;

            System.out.println((i+1)+ ". Sayının Değeri: " + sayilar[i] + "\n");
            ortalamaToplam += sayilar[i];

        }
        System.out.println("Girilen sayiların ortalaması : " + (ortalamaToplam/gelenSayi));

      }
    }

