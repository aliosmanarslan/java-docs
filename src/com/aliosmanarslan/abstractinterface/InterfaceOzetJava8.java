package com.aliosmanarslan.abstractinterface;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 17.10.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description:
 */

public class InterfaceOzetJava8 {
    public static void main(String[] args) {

        SinifA sinifA = new SinifA();
        sinifA.defaultMetot();

        boolean sonuc = InterfaceA.emailKontrol("ali@arslan.com");
        System.out.println(sonuc);


    }
}

interface InterfaceA{

    abstract public void metotA();

    default void defaultMetot(){
        System.out.println("Ben default metotum");
    }

    static final int sayi = 10;

    static boolean emailKontrol(String mail){
        if(mail.contains("@")){
            return true;
        }else return false;
    }
}

class SinifA implements InterfaceA{

    @Override
    public void metotA() {

    }

    @Override
    public void defaultMetot() {
        System.out.println("Ben a sınıfı içindeki default metotum");
    }
}