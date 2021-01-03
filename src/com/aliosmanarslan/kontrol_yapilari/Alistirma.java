package com.aliosmanarslan.kontrol_yapilari;

import java.util.Scanner;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Vücut kitle indeksi örneği
 */
public class Alistirma {
    public static void main(String[] args) {

        Scanner klavyeKg = new Scanner(System.in);
        System.out.print("Boyunuzu cm cinsinden giriniz : ");
        double kullaniciCm = klavyeKg.nextDouble();

        Scanner klavyeCm = new Scanner(System.in);
        System.out.print("Kilonuzu kg cinsinden giriniz : ");
        double kullaniciKg = klavyeCm.nextDouble();

        double vucutKitleEndeksi = kullaniciKg / (Math.pow(kullaniciCm/100,2));
        System.out.println("Vucüt Kitle Endeksiniz : " + vucutKitleEndeksi);

        if(vucutKitleEndeksi<15)
            System.out.println("Çok ciddi derecede düşük kilolu");
        else if(vucutKitleEndeksi>15 && vucutKitleEndeksi<16)
            System.out.println("Ciddi derecede düşük kilolu");
        else if(vucutKitleEndeksi>16 && vucutKitleEndeksi<18.6)
            System.out.println("Düşük kilolu");
        else if(vucutKitleEndeksi>18.5 && vucutKitleEndeksi<25)
            System.out.println("Normal(sağlıklı) kilo");
        else if(vucutKitleEndeksi>25 && vucutKitleEndeksi<30)
            System.out.println("Fazla kilolu");
        else if(vucutKitleEndeksi>30 && vucutKitleEndeksi<35)
            System.out.println("1.Dereceden (hafif) obez");
        else if(vucutKitleEndeksi>35 && vucutKitleEndeksi<40)
            System.out.println("2.Dereceden (ciddi) obez");
        else
            System.out.println("3.Dereceden (çok ciddi) obez");

    }
}
