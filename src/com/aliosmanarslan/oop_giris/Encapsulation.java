package com.aliosmanarslan.oop_giris;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 30.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Encapsulation ile Veri Saklama
 */

public class Encapsulation {
    public static void main(String[] args) {

        Calisan calisan1 = new Calisan(123,"Ali",true);
        //Calisan.isim = "Samet"  -> yapamıyorsun - get set kullanman gerek.
        calisan1.calisanBilgileriniYazdir();
        calisan1.setCalisanId(456);
        calisan1.calisanBilgileriniYazdir();


        System.out.println("Personelin adı: " + calisan1.getIsim());


    }
}
