package com.aliosmanarslan.kontrol_yapilari;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: BreakVeContinue
 */

public class BreakVeContinue {
    public static void main(String[] args) {

        for(int i = 0; i<10; i++){

            System.out.println("i'nin değeri : " + i);

            if (i == 4)
                break;      // döngüyü bitir.
        }

        System.out.println("************************************");
        //etiket kavramı
        birinciFor :for (int a = 0; a < 5; a++){


            ikinciFor: for(int b = 0; b < 3; b++){
                System.out.println("a:"+a + " b:"+b);

                if(a==2 && b==1)
                    break birinciFor; //etiketteki döngüyü bitir.

            }
        }

        System.out.println("************************************");
        for (int k=0; k<5; k++){

            if(k==2)
                continue;   // k=2 ise sadece bu işlemi pas geç ve döngüye devam et.

            System.out.println("k: " + k);
        }

        System.out.println("************************************");
        for (int j=0; j<5; j++){

            if(j==2)
                return;   // j=2 ise metot u sonlandır.

            System.out.println("j: " + j);
        }
        System.out.println("Buraları neden yazmıyor?");
        System.out.println("Çünkü return ile ilgili metotdan çıkış yaptı.");

    }
}
