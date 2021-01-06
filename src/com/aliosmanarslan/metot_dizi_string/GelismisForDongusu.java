package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 5.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Gelismis For Dongusu
 */

public class GelismisForDongusu {
    public static void main(String[] args) {

        int[] sayilar = {1,5,6,-7,8};
        String [] isimler = {"ali","osman","arslan"};

        for(int i = 0; i < sayilar.length; i++)
            System.out.println("Sayılar for: " + sayilar[i]);

        for(int j : sayilar)
            System.out.println("Sayılar gelismis for : " + j);

        for(String k : isimler)
            System.out.println("İsimler gelismis for : " + k);

    }
}
