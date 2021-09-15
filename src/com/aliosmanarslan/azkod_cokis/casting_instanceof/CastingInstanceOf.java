package com.aliosmanarslan.azkod_cokis.casting_instanceof;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 11.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: none
 */

public class CastingInstanceOf {
    public static void main(String[] args) {

        GeometrikSekil gs1 = new Kare(5);

        System.out.println("**");
        GeometrikSekil gs2 = new Dikdortgen(5,10);
        System.out.println("**");

        Dikdortgen d1 = new Kare(7);

        System.out.println("**");
        Dikdortgen d2 = (Dikdortgen) gs2; // explicit direkt olarak , downcasting
        System.out.println("**");

        Elips elips1 = new Elips();
        Koni koni1 = new Koni();

        alaniGoster(gs1);
        alaniGoster(gs2);
        alaniGoster(d1);
        alaniGoster(d2);
        alaniGoster(elips1);
        alaniGoster(koni1);
    }

    public static void alaniGoster(GeometrikSekil sekil){
        sekil.alanHesapla();
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

class Elips extends GeometrikSekil{
    @Override
    public void alanHesapla() {
        System.out.println("Elips alan hesaplaması çalıştı");
    }
}

class Koni extends GeometrikSekil{
    @Override
    public void alanHesapla() {
        System.out.println("Koni alan hesaplaması çalıştı");
    }
}
