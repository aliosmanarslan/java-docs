package com.aliosmanarslan.azkod_cokis;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 9.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: none
 */

public class PolymorphismKavrami {
    public static void main(String[] args) {

        Hayvan hayvan1 = new Hayvan();
        Kopek kopek1 = new Kopek("Golden");
        Kedi kedi1 = new Kedi("Van kedisi");

        adiniSoyle(hayvan1);
        adiniSoyle(kedi1);
        adiniSoyle(kopek1);

    }
    public static void adiniSoyle(Hayvan hayvan){
        hayvan.adiniSoyle();
    }

}

class Hayvan{

    private int ayakSayisi;



    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    public void adiniSoyle(){
        System.out.println("Ben hayvan sınıfı nesnesiyim");
    }
}

class Kopek extends Hayvan{

    private String tur;

    public Kopek(String tur) {
        setAyakSayisi(4);
        setTur(tur);
        this.tur = tur;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir köpek nesnesiyim");
    }
}

class Kedi extends Hayvan{

    private String cinsi;

    public Kedi(String cinsi) {
        setAyakSayisi(4);
        setCinsi(cinsi);
        this.cinsi = cinsi;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir kedi nesnesiyim");
    }
}