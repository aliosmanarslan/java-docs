package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 6.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Dizilerin orijinali bozmadan "kopya değerler" oluşturmak
 */

public class DizilerinKopyalanmasi {
    public static void main(String[] args) {

        int[] anaDizi = {1,3,5,7};
        int[] anaDizi2 = {-4,6,15,25};
        int[] kopyaDizi = new int[anaDizi.length];

        //manuel kopyalama
        for(int index = 0; index <anaDizi.length; index++){
            kopyaDizi[index] = anaDizi[index];
        }

        diziyiEkranaYazdir(kopyaDizi);

        //System.arraycopy() komut
        int[] kopyaDizi2 = new int[anaDizi2.length];
        System.arraycopy(anaDizi2,0,kopyaDizi2,0,anaDizi2.length);
        diziyiEkranaYazdir(kopyaDizi2);

        System.out.println("***************");
        int[] tersDizi = dizininTersiniOlustur(anaDizi2);
        diziyiEkranaYazdir(tersDizi);
    }

    private static int[] dizininTersiniOlustur(int[] tersiOlusturulacakDiziParametre) {
        int[] tersDizi = new int[tersiOlusturulacakDiziParametre.length];

        for(int i = 0, j = tersDizi.length - 1; i < tersDizi.length; i++ , j--){
           tersDizi[i] = tersiOlusturulacakDiziParametre[j];
        }

        return tersDizi;
    }

    private static void diziyiEkranaYazdir(int[] yazdirilacakDiziParametre) {
        for(int sayi : yazdirilacakDiziParametre){
            System.out.println("Kopya dizi elemanı : " + sayi);
        }
        System.out.println();
    }
}
