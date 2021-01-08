package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 7.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Iskambil destesini diziler ile olusturun. Sonrasında bu destedeki
 * elemanları karıştırın ve de ilk kullanıcıya hangi 4 kartın geldiğini
 * ekrana yazdırın.
 */

public class Alistirma3 {
    public static void main(String[] args) {
        String[] kartTurleri = {"Kupa","Maça","Karo","Sinek"};
        String[] kartNumaralari = {"As","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int[] deste = new int[52];

        desteOlustur(deste);
        //desteyiGoster(deste,kartTurleri,kartNumaralari);
        desteyiKaristir(deste);
        desteyiGoster(deste,kartTurleri,kartNumaralari);

    }

    private static void desteyiKaristir(int[] deste) {
        for(int i = 0; i<deste.length; i++){
            int random = (int)(Math.random() * deste.length);
            int gecici = deste[i];

            deste[i] = deste[random];
            deste[random] = gecici;
        }
    }

    private static void desteyiGoster(int[] deste, String[] kartTurleri, String[] kartNumaralari) {
        for(int i = 0; i <4; i++){

            String kartTuru = kartTurleri[deste[i] / 13];
            String kartNumarasi = kartNumaralari[deste[i] % 13];

            System.out.println(kartTuru + " " + kartNumarasi);
        }
    }

    private static void desteOlustur(int[] deste) {
        for(int i = 0; i <deste.length; i++){
            deste[i] = i;
        }
    }
}
