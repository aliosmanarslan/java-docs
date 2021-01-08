package com.aliosmanarslan.metot_dizi_string;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 6.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: İki Boyutlu Diziler ve Örnek Uygulama
 */

public class IkiBoyutluDiziler {
    public static void main(String[] args) {

        //2 x 3 lük bir matris için
        int[][] matris = new int[2][3];
        matris[0][0] = 8;
        matris[0][1] = 5;
        matris[0][2] = 3;
        matris[1][1] = 9;
        matris[1][2] = 2;


        //3 x 3 lük bir matris
        int[][] matris2 = { {4,7,2} , {1,2,6} , {-7,2,0} };

        for(int satir = 0; satir < matris2.length; satir++){
            for(int sutun = 0; sutun < matris2[satir].length; sutun++){
                System.out.println((satir+1) +". Satırındaki " + (sutun+1) + ". sutunu : " + matris2[satir][sutun]);
            }
        }
        System.out.println("*************************************");
        int[][] borclar = { {0,100,200} , {350,0,250} , {150,500,0} };
        String[] isimler = {"Emre","Hasan","Ali"};

        for(int satir = 0; satir < borclar.length; satir++){
            for(int sutun = 0; sutun < borclar[satir].length; sutun++) {
                if (satir != sutun) {
                    int alacak = borclar[satir][sutun] - borclar[sutun][satir];
                    if (alacak < 0)
                        System.out.println(isimler[satir] + " nin " + isimler[sutun] + " dan alacağı : " + (-alacak));

                }
            }
        }

    }
}
