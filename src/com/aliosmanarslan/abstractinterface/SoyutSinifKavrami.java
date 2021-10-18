package com.aliosmanarslan.abstractinterface;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 15.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Abstract Class Soyut Sınıf Nedir
 */

public class SoyutSinifKavrami {
    public static void main(String[] args) {

        GeometrikSekil kare = new Kare(5);
        kare.cevreHesapla();
        kare.alanHesapla();
        ((Kare)kare).adiniSoyle();

        GeometrikSekil dikdortgen = new Dikdortgen(10,12);
        dikdortgen.cevreHesapla();
        dikdortgen.alanHesapla();
        ((Dikdortgen) dikdortgen).adiniSoyle();

        GeometrikSekil daire = new Daire(5);
        daire.cevreHesapla();
        daire.alanHesapla();

        alanlariKarsilastir(dikdortgen,daire);
        alanVeCevreyiSoyle(kare);
        alanVeCevreyiSoyle(daire);

    }

    public static void alanVeCevreyiSoyle(GeometrikSekil gs1){
        gs1.cevreHesapla();
        gs1.alanHesapla();
    }

    public static void alanlariKarsilastir(GeometrikSekil gs1, GeometrikSekil gs2){
            if(gs1.getHesaplananAlan() < gs2.getHesaplananAlan()){
                System.out.println("Birinci şeklin alanı ikinci şekilden küçük");
            }else if(gs1.getHesaplananAlan() > gs2.getHesaplananAlan()){
                System.out.println("Birinci şeklin alanı ikinci şekilden büyük");
            }else{
                System.out.println("Alanlar birbirine eşit");
            }
    }
}

abstract class GeometrikSekil{

    private int birinciKenar;
    private int hesaplananAlan;

    abstract public void cevreHesapla();

    abstract public void alanHesapla();

    public int getHesaplananAlan() {
        return hesaplananAlan;
    }

    public void setHesaplananAlan(int hesaplananAlan) {
        this.hesaplananAlan = hesaplananAlan;
    }

    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }
}

class Kare extends GeometrikSekil{

    public Kare(int kenar) {
        this.setBirinciKenar(kenar);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Karenin çevresi :" + getBirinciKenar() * 4);
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar() * getBirinciKenar());
        System.out.println("Karenin alanı : " + getHesaplananAlan());
    }

    public void adiniSoyle(){
        System.out.println("Ben bir kare nesnesiyim");
    }
}

class Dikdortgen extends GeometrikSekil{

    private int ikinciKenar;

    public Dikdortgen(int birinciKenar, int ikinciKenar) {
        setBirinciKenar(birinciKenar);
        this.ikinciKenar = ikinciKenar;
    }

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dikdörtgenin çevresi: " + 2*(getBirinciKenar() + ikinciKenar));
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar()*ikinciKenar);
        System.out.println("Dikdörtgenin alanı: " + getHesaplananAlan());
    }

    public void adiniSoyle(){
        System.out.println("Ben bir dikdörtgen nesnesiyim");
    }
}

class Daire extends GeometrikSekil{

    public Daire(int yaricap) {
        setBirinciKenar(yaricap);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dairenin çevresi: " + 2 * 3.14 * getBirinciKenar());
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan((int) (3.14 * getBirinciKenar()*getBirinciKenar()));
        System.out.println("Dairenin alanı: " + getHesaplananAlan());
    }
}