package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Metot Kavramı
 */

public class MetotKavrami {
    public static void main(String[] args) {

        menuGoster();
        sayilariTopla(5,3);
        sayilariTopla(7,4);
        sayilariTopla(10,5);

        int sayi = 2;
        sayiyiDegistir(sayi);
        System.out.println("Sayının gerçek değeri " + sayi);

        System.out.println("Geriye değer döndürülen sayıların farkları : " + sayilarinFarklariniBul(80,50));

        int donulenDeger = sayilarinFarklariniBul(80,50);

        System.out.println("Geriye değer döndürülen sayıların farkları : " + donulenDeger);

    }

    //Parametre almayan metot örneği
    public static void menuGoster(){
        System.out.println("******* MENU *******");
        System.out.println("1 - İki sayının toplamlarını bul");
        System.out.println("2 - İki sayının farklarını bul");
        System.out.println("3 - İki sayının çarpımlarını bul");
        System.out.println("4 - İki sayının bölümlerini bul");
    }

    //Parametre alan ama geriye değer döndürmeyen metot örneği
    public static void sayilariTopla(int birinciSayi, int ikinciSayi){
        System.out.println("Sayıların toplamı : " + (birinciSayi+ikinciSayi));
    }

    //Parametre alan ama geriye değer döndürmeyen metot örneği
    public static void sayiyiDegistir(int sayi) {
        System.out.println("Void ifadede sayının değeri :" + (sayi + 20));
    }

    //Parametre alan ve geriye değer döndüren metot örneği
    //Geriye hangi tip değişken döndürülecekse void yerine o değişkenin tipi yazılır  void -> int
    //Geriye döndürme işlemi return ile yapılır
    public static int sayilarinFarklariniBul(int a, int b){
        return (a-b);
    }
}
