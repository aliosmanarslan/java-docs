package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 7.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunan
 * sayıların toplamını yazdıran program yazınız.Ayrıca bu matriste yer
 * alan en küçük ve en büyük sayıyı da mesaj olarak göstersin.
 * */

public class Alistirma2 {
    public static void main(String[] args) {
        int[][] dizi = new int[3][2];
        int toplam = 0, enKucukSayi = 100, enBuyukSayi = 0;

        for(int satir = 0; satir < dizi.length; satir++){
            for(int sutun = 0; sutun < dizi[satir].length; sutun++){
                int random = (int)(Math.random() * 100);
                dizi[satir][sutun] = random;
                toplam += random;
                System.out.print(dizi[satir][sutun] + " ");
                if(enKucukSayi > random)
                    enKucukSayi = random;
                if(enBuyukSayi < random)
                    enBuyukSayi = random;
            }
        }
        System.out.println("\nEn küçük sayı: " + enKucukSayi);
        System.out.println("En büyük sayı: " + enBuyukSayi);
    }


}
