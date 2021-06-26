package com.aliosmanarslan.oop_giris;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 30.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Çalışan classı - Encapsulation ile bağlantılı
 */


public class Calisan {

    private int calisanId;
    private String isim;
    private boolean aktif;

    //Constructur metot
    public Calisan(){

    }
    //Constructur metot
    public Calisan(int calisanId, String isim, boolean aktif){
        this.calisanId = calisanId;
        this.isim = isim;
        this.aktif = aktif;
    }

    // Get - Set
    public void setCalisanId(int yeniCalisanId){
        this.calisanId = yeniCalisanId;
    }
    public void setIsim(String yeniIsim){
        this.isim = yeniIsim;
    }
    public void setAktif(boolean guncelAktiflik){
        this.aktif = guncelAktiflik;
    }

    // Get - Set

    public int getCalisanId(){
        return calisanId;
    }
    public String getIsim(){
        return isim;
    }
    public boolean getAktif(){
        return aktif;
    }

    //yazdırma

    public void calisanBilgileriniYazdir(){
        if(aktif){
            System.out.println("Personel adı: " + isim + " ID: " + calisanId + "\n");
        }else{
            System.out.println("Personel çalışmıyor \n");
        }
    }

}
