package com.aliosmanarslan.operatorler;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: IslemOnceligi
 */
public class IslemOnceligi {
    public static void main(String[] args) {

        /*
        1. () önce parantez içi hesaplanır
        2. ++ ve -- (eğer değişkenden önce ise)
        3. çarpma ve bölme
        4. toplama ve çıkarma
        5. = atama işlemi
        6. ++ ve -- (eğer değişkenden sonra ise)
        */

        int sayi1 = 15;
        int sayi2 = 5;


        int sonuc = 0;
        sonuc = ((sayi1 +  sayi2 *2 - sayi2) + sayi2 - sayi1 *4 + sayi1);
        System.out.println("Birinci sonuç : " + sonuc);

        sonuc = (sayi1 * sayi2 + 4 / 2) + sayi1++ * sayi2 + sayi1;
        System.out.println("İkinci sonuç : " + sonuc);

    }
}

