package com.aliosmanarslan.oop_giris;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 29.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Ogrenci class
 */

public class Ogrenci {

    int ogrenciNo;
    String isim;
    byte sinif;
    boolean aktif;

    //Constructor metotum
    public Ogrenci(){

    }

    public Ogrenci(int ogrenciNo, String isim){
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
    }


    public Ogrenci(int ogrenciNo, String isim, byte sinif, boolean aktif){
        // this(değişken1, değişken2) ile metot çağırımı yapıyoruz
        this(ogrenciNo,isim);
        this.sinif = sinif;
        this.aktif = true;
        //this.değişken1 ile değişken çağırımı yapıyoruz
    }

    public void ogrenciBilgileriniYazdir(){
        if(aktif){
            System.out.println("Adım: " + isim + " Numaram: " + ogrenciNo + " Sınıfım: " + sinif + "\n");
        }else{
            System.out.println("Öğrenci ders almıyor \n");
        }
    }

}
