package com.aliosmanarslan.operatorler;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: IliskiselKarsilastirmaVeMantiksalOperator
 */
public class IliskiselKarsilastirmaVeMantiksalOperator {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 5;

        System.out.println("Sayı1 eşit mi Sayı2 : " + (sayi1 == sayi2));
        System.out.println("Sayı1 küçük mü Sayı2 : " + (sayi1 < sayi2));
        System.out.println("Sayı1 büyük mü Sayı2 : " + (sayi1 > sayi2));
        System.out.println("Sayı1 büyük veya eşit mi Sayı2 : " + (sayi1 >= sayi2));
        System.out.println("Sayı1 küçük veya eşit mi Sayı2 : " + (sayi1 <= sayi2));
        System.out.println("Sayı1 denk mi Sayı2 : " + (sayi1 != sayi2));
        System.out.println();

        boolean deger1 = true;
        boolean deger2 = false;

        System.out.println("Deger1 ve deger2 and (ve) durumu : " + (deger1 && deger2));
        System.out.println("Deger1 ve deger2 or (ve ya) durumu : " + (deger1 || deger2));

    }
}
