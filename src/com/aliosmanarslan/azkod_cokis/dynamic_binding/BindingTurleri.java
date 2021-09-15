package com.aliosmanarslan.azkod_cokis.dynamic_binding;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 10.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: no
 */

public class BindingTurleri {
    public static void main(String[] args) {

       /* UstSinif ustSinifNesnesi = new UstSinif();
        ustSinifNesnesi.adiniSoyleStatic();

        AltSinif altSinifNesnesi = new AltSinif();
        altSinifNesnesi.adiniSoyleStatic();

        UstSinif ustSinif = new AltSinif(); //üst sınıf static metodu çalışır
        ustSinif.adiniSoyleStatic();*/

        UstSinif ustSinif2 = new AltSinif();
        ustSinif2.adiniSoyle();

    }
}

class UstSinif{

    public static void adiniSoyleStatic(){
        System.out.println("Üst sınıfın static adını söyle metotu çağrıldı");
    }
    public void adiniSoyle(){
        System.out.println("Üst sınıfın adını söyle metotu çağrıldı");
    }

}

class AltSinif extends UstSinif{

    public static void adiniSoyleStatic(){ // Static metot override edilemez
        System.out.println("Alt sınıfın static adını söyle metotu çağrıldı");
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Alt sınıfın adını söyle metotu çağrıldı override edilmiş");
    }
}