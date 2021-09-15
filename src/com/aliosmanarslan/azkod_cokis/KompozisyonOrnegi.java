package com.aliosmanarslan.azkod_cokis;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 26.06.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description:
 */

public class KompozisyonOrnegi {
    public static void main(String[] args) {

        Araba birinciAraba = new Araba();
        Araba ikinciAraba = new Araba();

        birinciAraba.hareketeGec();
        birinciAraba.durmayaBasla();
    }
}
class Motor{

    private String isim;
    private int beygirGucu;

    public Motor(){
        isim = "Renault";
        beygirGucu = 180;
    }

    public void calistir(){
        System.out.println("Motor çalıştırıldı");
    }

    public void durdur(){
        System.out.println("Motor durduruldu");
    }
}

class Araba{

    private Motor motor;
    private String marka;
    private String renk;
    private int uretimYili;

    public Araba(){
        motor = new Motor();
        marka = "Mercedes-Benz";
        renk = "Siyah";
        uretimYili = 2021;
    }

    public void hareketeGec(){
        System.out.println("Araba harekete geçiyor");
    }

    public void durmayaBasla(){
        System.out.println("Araba durmaya başladı");
    }

}
