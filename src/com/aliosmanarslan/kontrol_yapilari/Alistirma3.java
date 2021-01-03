package com.aliosmanarslan.kontrol_yapilari;

import java.util.Scanner;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: 16 Çeşit farklı örnekler
 */
public class Alistirma3 {
    public static void main(String[] args) {

        /*

        //Alıştırma 1
        Scanner alistirma1Klavye1 = new Scanner(System.in);
        System.out.print("1.Sayı : ");
        int alistirma1sayi1 = alistirma1Klavye1.nextInt();
        System.out.print("2.Sayı : ");
        int alistirma1sayi2 = alistirma1Klavye1.nextInt();
        System.out.print("3.Sayı : ");
        int alistirma1sayi3 = alistirma1Klavye1.nextInt();

        double alistirma1Ortalama = ((double) alistirma1sayi1 + (double)alistirma1sayi2 + (double) alistirma1sayi3 )/3;
        System.out.println("3 Sayının ortalaması : " + alistirma1Ortalama);

        */      // Alıştırma 1

        /*

        Scanner alistirma2klavye1 = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz: ");
        int birinciKenar = alistirma2klavye1.nextInt();

        Scanner alistirma2klavye2 = new Scanner(System.in);
        System.out.println("İkinci kenarı giriniz: ");
        int ikinciKenar = alistirma2klavye2.nextInt();

        Scanner alistirma2klavye3 = new Scanner(System.in);
        System.out.println("Üçüncü kenarı giriniz: ");
        int ucuncuKenar = alistirma2klavye3.nextInt();

        if(birinciKenar == ikinciKenar && birinciKenar == ucuncuKenar)
            System.out.println("Üçüzkenar bir üçgen");
        else if(birinciKenar == ikinciKenar || birinciKenar == ucuncuKenar || ucuncuKenar == ikinciKenar)
            System.out.println("İkizkenar bir üçgen");
        else
            System.out.println("Kenarları eşit olmayan bir üçgen");

         */      // Alıştırma 2

        /*

        Scanner alistirma3Klavye1 = new Scanner(System.in);
        System.out.print("Vize notunuz giriniz :");
        int vizeNotu = alistirma3Klavye1.nextInt();

        Scanner alistirma3klavye2 = new Scanner(System.in);
        System.out.print("Final notunuz giriniz :");
        int finalNotu = alistirma3klavye2.nextInt();

        double ortalamNot = ((double) vizeNotu * 0.4 + (double) finalNotu * 0.6);

        if (ortalamNot >= 50)
            System.out.println("Tebrikler dersi geçtiniz");
        else
            System.out.println("Dersten kaldınız");


         */     // Alıştırma 3

        /*

        for(int i = 0; i < 5; i++){
            System.out.println("Ali Osman Arslan - For");
        }

        int i = 0;
        while (i < 5){
            i++;
            System.out.println("Ali Osman Arslan - While");
        }

        int j = 0;
        do{
            System.out.println("Ali Osman Arslan - Do while");
            j++;
        }while(j < 5);

        */     // Alıştırma 4

        /*
        int toplam = 0;
        for(int i = 1; i<=100; i++){
            toplam += i;
        }
        System.out.println("1 Den 100 e kadar olan sayıların toplamı :" + toplam);

         */     // Alıştırma 5

        /*

        for(int i = 1; i <= 10; i++){
            if(i == 10){
                System.out.print(i);
                break;
            }
            System.out.print(i + ",");
        }

        */     // Alıştırma 6

        /*

        Scanner alistirma7klavye1 = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı giriniz :");
        int faktoriyel = alistirma7klavye1.nextInt();
        int toplamIslemi = 1;

        for (int i = 1; i <= faktoriyel; i++){
            toplamIslemi *=  i;
            System.out.println("Girdğiniz sayının faktöriyeli :" + toplamIslemi);

        }

         */     // Alıştırma 7

        /*

        Scanner alistirma8klavye1 = new Scanner(System.in);
        System.out.print("X sayısını giriniz :");
        int x = alistirma8klavye1.nextInt();

        Scanner alistirma8klavye2 = new Scanner(System.in);
        System.out.print("Y sayısını giriniz :");
        int y = alistirma8klavye2.nextInt();
        int fonk1 = (4*x + 2*y + 4);
        int fonk2 = (2*x - y + 3);
        int fonk3 = (3*x + 4*y + 3);



        if(x>0 && y<0)
            System.out.println(fonk1);
        else if (x>0 && y == 0)
            System.out.println(fonk2);
        else if(x<0 && y>0)
            System.out.println(fonk3);
        else
            System.out.println("geçerli olmayan koşul");

        */     // Alıştırma 8


        /*
        for(int i = 1; i <= 10; i++){

            for(int j = 0; j <=10; j++){
                System.out.println(i*j);
                if(j==10)
                    System.out.println("*************");
            }
        }

         */     // Alıştırma 10

        /*
        int randomSayi =  (int)(Math.random() * 100);


        int tahminSayisi;

        for(int i = 0; ;i++){
            Scanner alistirma11klavye1 = new Scanner(System.in);
            System.out.println("Sayı giriniz : ");
            tahminSayisi = alistirma11klavye1.nextInt();
            if(randomSayi == tahminSayisi)
                System.out.println("Tebrikler " + i + " seferde bildiniz");
            else if(tahminSayisi > randomSayi)
                System.out.println("Çok girdin değeri azalt");
            else if(tahminSayisi < randomSayi)
                System.out.println("Az girdin değeri arttır");

        }

         */     // Alıştırma 11

        /*
        int toplam = 1;

        sayiCarpma :for(;;){
            Scanner alistirma12klavye1 = new Scanner(System.in);
            System.out.print("Sayı giriniz");
            int sayilar = alistirma12klavye1.nextInt();

            if(sayilar == 0){
                System.out.println("Girdiğiniz sayıların çarpımı : " + toplam);
                break sayiCarpma;
            }
            toplam *= sayilar;

        }

         */     // Alıştırma 12

        /*

        Scanner alistirma13klavye1 = new Scanner(System.in);
        System.out.print("Birinci sayı :");
        int sayi1 = alistirma13klavye1.nextInt();

        Scanner alistirma13klavye2 = new Scanner(System.in);
        System.out.print("İkinci sayı :");
        int sayi2 = alistirma13klavye2.nextInt();

        int enBuyuk = Math.max(sayi1,sayi2);

        for(int i = enBuyuk; i >1 ; i--){
            if(sayi1 % i == 0 && sayi2 % i == 0)
                System.out.println("En büyük ortak bölen : " + i);
        }

         */     // Alıştırma 13

        /*

        Scanner alistirma14klavye1 = new Scanner(System.in);
        System.out.print("Bir kelime yazınız : ");
        String polindrome = alistirma14klavye1.next();

        int altSinir = 0;
        int ustSinir = polindrome.length() -1;
        boolean polMu = true;

        while(altSinir < ustSinir){
            if(polindrome.charAt(altSinir) != polindrome.charAt(ustSinir)){
                polMu = false;
                break;
            }
            altSinir++;
            ustSinir--;
        }
        if(polMu)
            System.out.println("Palindromedur");
        else
            System.out.println("Değildir");

         */    // Alıştırma 14

        /*

        Scanner alistirma15klavye1 = new Scanner(System.in);
        System.out.print("Asal sayı bulmak için bir değer girin :");
        int sayi1 = alistirma15klavye1.nextInt();

        for(int i = 2; i <= sayi1 ; i++){
            boolean asalMi = true;
            for(int j = 2; j < i; j++){

                if(i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if(asalMi)
            System.out.println(i);

        }

         */    // Alıştırma 15

        /*

        int artisMiktari = 0;
        boolean artiyorMu = true;
        int toplam = 0;

        for(int i = 1; i <= 35; i += artisMiktari){

            System.out.print(i + " ");
            toplam = toplam + i;

            if (artisMiktari <=4 && artiyorMu == true){
                artisMiktari++;

                if(artisMiktari == 5){
                    artiyorMu = false;
                    continue;
                }

            }else{
                artisMiktari--;
                if (artisMiktari == 1){
                    artiyorMu = true;
                    continue;
                }

            }

        }
        System.out.println("Toplam : " + toplam);
         */   // Alıştırma 16


    }
}
