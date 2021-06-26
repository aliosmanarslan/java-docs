package com.aliosmanarslan.oop_giris;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 30.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Static ile sınıfa özgü değişken
 */

public class StatikKavrami {
    public static void main(String[] args) {

        Memur m1 = new Memur();
        m1.setIsim("İbrahim");
        m1.setMaas(7000);
        System.out.println("Birinci memur: " + m1.getOlusturulanMemurSayisi());

        Memur m2 = new Memur();
        m2.setIsim("Onur");
        m2.setMaas(7500);
        System.out.println("Birinci memur: " + m1.getOlusturulanMemurSayisi());

        Memur m3 = new Memur();
        System.out.println("Üçüncü memur: " + Memur.getOlusturulanMemurSayisi() + "\n");
        System.out.println("Birinci memur: " + m1.getOlusturulanMemurSayisi());
        System.out.println("İkinci memur: " + m1.getOlusturulanMemurSayisi());
        System.out.println("Üçüncü memur: " + Memur.getOlusturulanMemurSayisi());

        //Static sayesinde nesne üretmeden metotu çağırabiliyorum
        Memur.kanunuSoyle();


    }
}

class Memur {

    private int maas;
    private String isim;
    private static int olusturulanMemurSayisi;

    public Memur(){
        olusturulanMemurSayisi++;
    }

    public static int getOlusturulanMemurSayisi() {
        return olusturulanMemurSayisi;
    }
    public static void kanunuSoyle(){
        System.out.println("Her personel için kanun aynıdır");
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if(maas < 0)
            maas = 0;
        else
            this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
