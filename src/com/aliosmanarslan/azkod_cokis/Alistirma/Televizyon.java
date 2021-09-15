package com.aliosmanarslan.azkod_cokis.Alistirma;

import java.util.ArrayList;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 14.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description:
 */

public class Televizyon {

    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;

    public Televizyon(String marka, String boyut) {
        this.marka = marka;
        this.boyut = boyut;
        this.aktifKanal = 1;
        kanallar = new ArrayList<>();
        kanallariOlustur();
        this.acik = false;
        this.ses = 10;
    }

    public void kanalDegistir(int acilmasiIstenenKanal){
        if(acik){
            if(acilmasiIstenenKanal != aktifKanal){
                if(acilmasiIstenenKanal <= kanallar.size() && acilmasiIstenenKanal >= 0){
                    aktifKanal = acilmasiIstenenKanal;
                    System.out.println("Kanal :" + acilmasiIstenenKanal + " Bilgi:"+kanallar.get(acilmasiIstenenKanal-1).kanalBilgisiniGoster());
                }else {
                    System.out.println("Geçerli bir kanal numarası giriniz.");
                }
            }else {
                System.out.println("Zaten " + aktifKanal + " kanaldasınız. Değiştirme yapılmadı.");
            }

        }else {
            System.out.println("Önce televizyonu açınız.");
        }
    }

    public void guncelKanalBilgileri(){

        if(acik)
            System.out.println("Güncel kanal bilgileri: " + kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
        else
            System.out.println("Önce tvyi kurun ve tv yi çalıştırın");
    }

    public void sesArttir(){
        if(ses < 20 && acik == true){
            ses++;
            System.out.println("Ses seviyesi: " + ses);
        }else{
            System.out.println("Ses maksimumda daha fazla arttıramazsın veya tv kapalı");
        }
    }

    public void sesAzalt(){
        if(ses > 0 && acik == true){
            ses--;
            System.out.println("Ses seviyesi: " + ses);
        }else{
            System.out.println("Ses minimumda daha fazla azaltamazsın veya tv kapalı");
        }
    }

    public void tvAc(){
        if(acik == false){
            acik = true;
            System.out.println("TV açıldı.");
        }else {
            System.out.println("TV zaten açık.");
        }
    }

    public void tvKapat(){
        if(acik == true){
            acik = false;
            System.out.println("TV kapandı.");
        }else {
            System.out.println("TV zaten kapalı.");
        }
    }

    private void kanallariOlustur() {
        HaberKanali cnn = new HaberKanali("CNN",1,"Genel Haber");
        kanallar.add(cnn);
        HaberKanali beinSpor = new HaberKanali("BeinSport",2,"Spor Haber");
        kanallar.add(beinSpor);
        MuzikKanali metroFm = new MuzikKanali("MetroFM",3,"Yabancı Müzik");
        kanallar.add(metroFm);
        MuzikKanali dreamTurk = new MuzikKanali("Dream Türk",4,"Yerli Müzik");
        kanallar.add(dreamTurk);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Marka: " + marka + " Boyut :" + boyut + " olan tv oluşturuldu.";
    }
}
