package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 5.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Gelismis For Dongusu, Metotlara Dizi Gondermek
 */

public class MetotlaraDiziGondermekVeAlmak {
    public static void main(String[] args) {

        int[] sayi = {1,2,3};

        System.out.println("Metottan önce index 0: ");
        degeriBirArttir(sayi[0]);
        System.out.println("Metottan önce index 0: ");

        System.out.println("Dizi değerlerini arrtırmadan önce ");
        diziGoster(sayi);
        System.out.println("Dizi değerlerini arttırdıktan sonra ");
        diziDegerleriniBirArttir(sayi);
        diziGoster(sayi);

    }

    //Gerçek değişken değeri aldı - Heap
    private static void diziDegerleriniBirArttir(int[] sayi) {
        sayi[0]++;
        sayi[1]++;
        sayi[2]++;
    }

    //Gerçek değişken değeri aldı - Heap
    private static void diziGoster(int[] sayi) {
        for (int goster: sayi)
            System.out.println("Dizi göster: " + goster);
    }

    //Kopya değişken değeri aldı - Stack
    private static void degeriBirArttir(int i) {

        i++;

    }
}
