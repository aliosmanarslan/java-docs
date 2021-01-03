package com.aliosmanarslan.kontrol_yapilari;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: WhileDoDonguleri
 */
public class WhileDoDonguleri {
    public static void main(String[] args) {

        int i = 10;      // tanımlama
        while(i<20){     // koşul
            i++;         // işlem
        }

        //while den farkı önce kod(işlem) çalıştırılır sonra koşula bakılır.
        int j = 15;      // tanımlama
        do{              // işlem
            System.out.println("Ali");
            j++;
        }while(j<20);    // koşul

    }
}
