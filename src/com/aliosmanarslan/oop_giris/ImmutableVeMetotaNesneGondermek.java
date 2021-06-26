package com.aliosmanarslan.oop_giris;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 31.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Immutable Degismez Nesneler ve Metotlara Nesne Gondermek
 */

public class ImmutableVeMetotaNesneGondermek {
    public static void main(String[] args) {

        Bilgisayar pc1 = new Bilgisayar(8,32,new String[]{"Msi","Asus","HP"});
        bilgileriYazdir(pc1);

        String[] ureticiler = pc1.getFirmaIsimleri();
        ureticiler[0] = "Apple";

        bilgileriYazdir(pc1);

    }
    public static void bilgileriYazdir(Bilgisayar pc1){
        System.out.println("Çekirdek sayısı: " + pc1.getCekirdekSayisi() + " Ram boyutu: " + pc1.getRamBoyutu()
                + " Firması: " + pc1.getFirmaIsimleri()[0]);
    }
}

class Bilgisayar{
    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] firmaIsimleri;

    public Bilgisayar(int cekirdekSayisi, int ramBoyutu, String[] firmaIsimleri) {
        this.cekirdekSayisi = cekirdekSayisi;
        this.ramBoyutu = ramBoyutu;
        this.firmaIsimleri = firmaIsimleri;
    }

    public String[] getFirmaIsimleri(){
        String[] kopyaFirmaIsimleri = new String[firmaIsimleri.length];

        for (int i=0; i < firmaIsimleri.length; i++){
            kopyaFirmaIsimleri[i] = firmaIsimleri[i];
        }
        return kopyaFirmaIsimleri;
    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public int getRamBoyutu() {
        return ramBoyutu;
    }

}
