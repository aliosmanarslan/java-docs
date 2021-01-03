package com.aliosmanarslan.kontrol_yapilari;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: MathSinifiKullanimi
 */
public class MathSinifiKullanimi {
    public static void main(String[] args) {

        System.out.println("Pi sayısı : " + Math.PI);
        System.out.println("E sayısı : " + Math.E);
        System.out.println("-7 nin mutlak değeri : " + Math.abs(-7));
        System.out.println("5.6 nın yuvarlanmış değeri : " + Math.ceil(5.6));
        System.out.println("5.2 nin yuvarlanmış değeri : " + Math.ceil(5.2));
        System.out.println("2 nin 3 üncü kuvveti : " + Math.pow(2,3));
        System.out.println("5 in 4 üncü kuvveti : " + Math.pow(5,4));
        System.out.println("16 nın karekökü : " + Math.sqrt(16));
        System.out.println("2 mi daha büyük 3 mü : " + Math.max(2,3));
        System.out.println("2 mi daha küçük 3 mü : " + Math.min(3,2));

        //Math.random() 0.0 dan 0.9999999 a kadar rasgele sayı üretir ve double dır.
        int onaKadarRasgeleSayi = (int) (Math.random() * 11);   // 10 a kadar rasgele tam sayı üret ( 0 dahil )
        int onaKadarRasgeleSayi2 = (int) (Math.random() * 10 + 1);   // 10 a kadar rasgele tam sayı üret ( 0 hariç )


        System.out.println("Rasgele üretilen sayı : " + onaKadarRasgeleSayi);
        System.out.println("Rasgele üretilen sayı : " + onaKadarRasgeleSayi2);

    }
}
