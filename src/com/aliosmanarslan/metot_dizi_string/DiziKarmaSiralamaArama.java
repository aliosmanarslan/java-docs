package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 6.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Dizi Elemanlarını Karıştırma ve SelectionSort ile Sıralama
 */

public class DiziKarmaSiralamaArama {
    public static void main(String[] args) {

        int[] dizi = {2,8,-8,4,0,-7,2};
        diziyiEkranaYazdir(dizi);

        diziRasgeleYerDegistir(dizi);
        diziyiEkranaYazdir(dizi);

        selectionShortSiralama(dizi);
        diziyiEkranaYazdir(dizi);
    }

    private static void diziRasgeleYerDegistir(int[] dizi) {
        for(int i = 0; i < dizi.length; i++){

            int rasgeleIndex = (int)(Math.random() * i);

            int gecici = dizi[i];
            dizi[i] = dizi[rasgeleIndex];
            dizi[rasgeleIndex] = gecici;

        }
    }

    public static void selectionShortSiralama(int[] dizi){

        for(int i = 0; i < dizi.length; i++){

            int oankiEnKucukSayi = dizi[i];
            int oankiEnKucukElemaninIndexi = i;
            for(int j = i+1; j < dizi.length; j++){
                if(oankiEnKucukSayi > dizi[j]){
                    oankiEnKucukSayi = dizi[j];
                    oankiEnKucukElemaninIndexi = j;
                }
            }
            if(oankiEnKucukElemaninIndexi != i){
                dizi[oankiEnKucukElemaninIndexi] = dizi[i];
                dizi[i] = oankiEnKucukSayi;
            }
        }
    }

    private static void diziyiEkranaYazdir(int[] dizi) {
        for(int i : dizi)
            System.out.print(i + ",");
        System.out.println();
    }

}
