package com.aliosmanarslan.azkod_cokis;

import java.util.ArrayList;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 12.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Arraylist Sınıfı Nedir Neden Kullanırız Metotları Nelerdir ?
 */

public class ArraylistKullanimi {
    public static void main(String[] args) {

        ArrayList<Telefon> telefonlar = new ArrayList<Telefon>();
        Telefon tel1 = new Telefon("iPhone 11",7500);
        Telefon tel2 = new Telefon("Samsung S10 Lite",4500);
        Telefon tel3 = new Telefon("Xiaomi Mi 10 Lite",3500);

        telefonlar.add(tel1);
        telefonlar.add(tel2);
        telefonlar.add(tel3);

        System.out.println(telefonlar.size());
        listeyiYazdir(telefonlar);

        telefonlar.add(0,tel3);    //kaydırma yaparak verilerin içine(üstüne) yazmaz.
        telefonlar.add(tel1);
        System.out.println("Değişikliklerden sonra:");
        telefonlar.set(3,tel2);         //kaydırma yapmadan doğrudan indexin üstüne yazar
        telefonlar.remove(4);     //4.indexi sildi
        System.out.println(telefonlar.contains(tel3));  //listede tel3 var mı?
        listeyiYazdir(telefonlar);
    }

    private static void listeyiYazdir(ArrayList<Telefon> telefonlar) {

        /*for(int i=0; i<telefonlar.size(); i++){
            System.out.println(telefonlar.get(i));
        }*/

        for (Telefon oankiDeger : telefonlar){
            System.out.println(oankiDeger);
        }
    }
}

class Telefon{
    String model;
    int fiyat;

    public Telefon(String model, int fiyat) {
        this.model = model;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "model='" + model + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}