package com.aliosmanarslan.oop_giris.alistirmalar;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 16.06.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Hesap makinesi sınıfı oluşturun.Bu sınıfta 4 işlem yapabilmek için metotlarınız olsun. Bu metotlara istenilen sayıda parametre geçilebilmeli.
 * Bölme işlemi için 0 değerini için gerekli kontrolü yazın.
 */

public class Alistirma3 {
    public static void main(String[] args) {

        System.out.println("Topla : " + HesapMakinesi.topla(10,12,14));
        System.out.println("Çıkar : " + HesapMakinesi.cikar(80,40,20,-60));
        System.out.println("Çarp : " + HesapMakinesi.carp(5,4,1,-10));
        if(HesapMakinesi.bolme(40,5,2) != -1) {
            System.out.println("Böl : " + HesapMakinesi.bolme(40, 5, 2));
        }else{
            System.out.println("Bölme işlemi başarısız");
        }
    }
}
class HesapMakinesi {

    public static int topla(int... parametreler) {
        int toplam = 0;
        for (int parametre : parametreler) {
            toplam = toplam + parametre;
        }
        return toplam;
    }

    public static int cikar(int... parametreler) {
        int carpmafark = parametreler[0];
            for (int i = 1; i < parametreler.length; i++){
                carpmafark = carpmafark - parametreler[i];
        }
        return carpmafark;
    }

    public static int carp(int... parametreler) {
        int carpimToplam = 1;
        for(int parametre : parametreler){
            carpimToplam = carpimToplam * parametre;
        }
        return carpimToplam;
    }

    public static double bolme(int... parametreler) {
        int bolmeFark = parametreler[0];
        for(int i = 1; i < parametreler.length; i++){
            if(parametreler[i] != 0){
                bolmeFark = bolmeFark / parametreler[i];
            }else{
                System.out.println("Parametrelerden biri 0 bölme yapılmadı");
                return -1;
            }
        }
        return bolmeFark;
    }
}