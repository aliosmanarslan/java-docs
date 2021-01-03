package com.aliosmanarslan.kontrol_yapilari;

import java.util.Scanner;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: KullanicidanVeriAlma
 */
public class KullanicidanVeriAlma {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        int yas = tara.nextInt();

        Scanner tara2 = new Scanner(System.in);
        String isimSoyisim = tara2.nextLine();

        Scanner tara3 = new Scanner(System.in);
        char cinsiyet = tara3.next().charAt(0);

        System.out.println("Kullanıcının Girdiği Sayı: " + yas);
        System.out.println("Adı ve Soyadı: " + isimSoyisim);
        System.out.println("Cinsiyeti: " + cinsiyet);
    }
}
