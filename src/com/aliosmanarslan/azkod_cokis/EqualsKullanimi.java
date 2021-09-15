package com.aliosmanarslan.azkod_cokis;

import java.util.Objects;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 12.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Object Sınıfı Metotlarından equals Metotunun Özellikleri
 */

public class EqualsKullanimi {
    public static void main(String[] args) {

        Kisi kisi1 = new Kisi(1,"ali");
        System.out.println(kisi1.toString());

        Kisi kisi2 = new Kisi(2,"osman");
        System.out.println(kisi2.toString());

        System.out.println("kisi1 ve kisi2 eşit mi :" + kisi1.equals(kisi2));
        System.out.println("kisi1 hashcode:"+kisi1.hashCode() + " kisi2:"+kisi2.hashCode());

        kisi1 = kisi2; //referans atama

        System.out.println("kisi1 ve kisi2 eşit mi :" + kisi1.equals(kisi2));

    }
}

class Kisi extends Object{

    int id;
    String isim;

    public Kisi(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kisi)) return false;
        Kisi kisi = (Kisi) o;
        return id == kisi.id && isim.equals(kisi.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isim);
    }

    @Override
    public String toString() {
        return "id:"+id + " isim:"+isim;
    }
}