package com.aliosmanarslan.degisken_kavrami;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: TipDonusumuTypeCasting
 */

public class TipDonusumuTypeCasting {
    public static void main(String[] args) {

        int tamSayi = 10;
        double doubleSayi1 = 21.50;

        //int - double
        doubleSayi1 = tamSayi;
        System.out.println("Sayının değeri : " + doubleSayi1);

        //int - float
        int tamSayi2 = 10;
        float floatSayi = 15.45f;

        tamSayi2 = (int) floatSayi;
        System.out.println("Sayının değeri : " + tamSayi2);

        //byte - double
        byte byteSayi = 4;
        byteSayi = (byte) doubleSayi1;
        System.out.println("Sayının değeri : " + byteSayi);

    }
}

