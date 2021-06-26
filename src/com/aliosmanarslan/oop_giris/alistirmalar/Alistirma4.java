package com.aliosmanarslan.oop_giris.alistirmalar;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 26.06.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Bir banka hesabı için sınıf tasarlayın. Bu sınıfta hesabın kime ait oldugunu tutan hesapNo,
 * hesaptakiPara, para yatirma ve çekme metotları olsun. Ayrıca bu hesaplarda olan tüm parayı, açılan hesap sayısını,
 * yapılan toplam paracekme ve para yatırma sayısını gösteren bir metot ve iki hesabı para değişkenine göre birbiriyle kıyaslayacak metot bulunmalı.
 */

public class Alistirma4 {
    public static void main(String[] args) {

        BankaHesap ali = new BankaHesap(1,1500);
        BankaHesap yarmagul = new BankaHesap(2,500);
        BankaHesap ece = new BankaHesap(3,2000);

        ali.paraYatir(300);
        yarmagul.paraCek(100);
        ece.paraCek(150);

        BankaHesap.bankaOzetiniGoster();
        yarmagul.kiyasla(ece);
    }
}
class BankaHesap{
    private int hesapNo;
    private int hesapBakiye = 0;
    private static int tumBankaBakiyesi = 0;
    private static int tumHesapSayisi = 0;
    private static int operasyonSayisi = 0;

    public BankaHesap(int hesapNo, int hesapBakiye) {
        this.hesapNo = hesapNo;
        this.hesapBakiye = hesapBakiye;
        tumBankaBakiyesi = hesapBakiye + tumBankaBakiyesi;
        tumHesapSayisi++;
    }
    public int getHesapNo() {
        return hesapNo;
    }
    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }
    public int getHesapBakiye() {
        return hesapBakiye;
    }
    public void setHesapBakiye(int hesapBakiye) {
        this.hesapBakiye = hesapBakiye;
    }

    public void paraYatir(int paraMiktari){
        this.hesapBakiye = hesapBakiye + paraMiktari;
        operasyonSayisi++;
        tumBankaBakiyesi = tumBankaBakiyesi + paraMiktari;
    }

    public void paraCek(int paraMiktari){
        if(hesapBakiye >= paraMiktari) {
            this.hesapBakiye = hesapBakiye - paraMiktari;
            operasyonSayisi++;
            tumBankaBakiyesi = tumBankaBakiyesi - paraMiktari;
        }else{
            System.out.println("Hesabınızda yeteri kadar para yok");
        }
    }

    public void kiyasla(BankaHesap kiyaslanacakHesap){
        if(this.getHesapBakiye() < kiyaslanacakHesap.getHesapBakiye()){
            System.out.println(this.hesapNo + " nolu id ye sahip kişinin " + kiyaslanacakHesap.hesapNo + " nolu id ye sahip kişiden parası azdır.");
        }else if(this.getHesapBakiye() == kiyaslanacakHesap.getHesapBakiye()){
            System.out.println(this.hesapNo + " nolu id ye sahip kişinin " + kiyaslanacakHesap.hesapNo + " nolu id ye sahip kişiyle parası aynıdır.");
        }else{
            System.out.println(this.hesapNo + " nolu id ye sahip kişinin " + kiyaslanacakHesap.hesapNo + " nolu id ye sahip kişiden parası fazladır.");
        }
    }

    public static void bankaOzetiniGoster(){

        System.out.println("Bankadaki hesap sayısı: " + tumHesapSayisi);
        System.out.println("Bankadaki toplam para: " + tumBankaBakiyesi);
        System.out.println("Bankada yapılan tüm operasyonların sayısı: " + operasyonSayisi);
    }
}