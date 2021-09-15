package com.aliosmanarslan.azkod_cokis;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 9.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: yok
 */

public class KalitimOrnek {
    public static void main(String[] args) {

       /* Dikdortgen d1 = new Dikdortgen(10,20);
        d1.ozellikYazdir();
        System.out.println(d1);

        GeometrikSekil gs1 = new GeometrikSekil(5,10);
        System.out.println(gs1);
*/
        Kare k1 = new Kare(10);
        k1.alanHesapla();
        k1.cevreHesapla();
    }
}

class GeometrikSekil{

    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
        System.out.println("Geometrik şekil oluşturuldu");
    }

    public GeometrikSekil(int en) {
        this.en = en;
        System.out.println("Geometrik şekil oluşturuldu");
    }

    public GeometrikSekil() {
        System.out.println("Geometrik şekil oluşturuldu");
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void alanHesapla(){
        System.out.println("Alan : " + (getEn()*getBoy()));
    }
    public void cevreHesapla(){
        System.out.println("Çevre : " + (en+boy) * 2);
    }

    @Override
    public String toString(){
        return "Seklin Eni:"+en+" boyu:"+boy;
    }

}

class Dikdortgen extends GeometrikSekil{

    public Dikdortgen(int en, int boy){
        setEn(en);
        setBoy(boy);
        System.out.println("Dikdörtgen oluşturuldu");
    }

    public Dikdortgen(int en) {
        setEn(en);
        System.out.println("Dikdörtgen oluşturuldu");
    }

    public void ozellikYazdir(){
        System.out.println("Geometrik şeklin eni: " + getEn() + " boyu: " + getBoy());
        alanHesapla();
        cevreHesapla();
    }

    @Override
    public String toString() {
        return "Dikdortgenin eni: " + getEn() + " boyu:" + getBoy();
    }
}

class Kare extends Dikdortgen{


    public Kare(int en) {
        super(en); //super üst sınıfın constructorını belirler
        setBoy(en);
        System.out.println("Kare oluşturuldu");
    }

}