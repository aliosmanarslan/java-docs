package com.aliosmanarslan.azkod_cokis.Alistirma;

import com.aliosmanarslan.oop_giris.Ogrenci;

import java.util.ArrayList;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 14.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Kendi Yığın Yapımızı Oluşturalım
 */

public class Soru1 {
    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        Ogrenci ogr1 = new Ogrenci(2050,"Ali");
        Ogrenci ogr2 = new Ogrenci(2051,"Osman");
        Ogrenci ogr3 = new Ogrenci(2052,"Arslan");
        Ogrenci ogr4 = new Ogrenci(2053,"Emre");

        myStack.push(ogr1);
        myStack.push(ogr2);
        myStack.push(ogr3);
        myStack.push(ogr4);
        myStack.yazdir();
        System.out.println(myStack.kacElemanVar() + " tane eleman var");
        myStack.pop();
        myStack.yazdir();
        System.out.println(myStack.kacElemanVar() + " tane eleman var");
        System.out.println(myStack.bosMu());
        System.out.println(myStack.elemanGoster());

    }
}

class MyStack{

    private ArrayList<Object>  liste = new ArrayList<>();

    public MyStack(){
        liste = new ArrayList<>();
    }

    public int kacElemanVar(){
        return liste.size();
    }

    public boolean bosMu(){
        return liste.isEmpty();
    }

    public Object elemanGoster(){
        return liste.get(kacElemanVar() - 1);
    }

    public Object pop(){
        if(kacElemanVar() > 0){
            Object geriyeDondurulecekEleman = liste.get(kacElemanVar() - 1);
            liste.remove(kacElemanVar() - 1);
            return geriyeDondurulecekEleman;
        }else{
            System.out.println("Yığın boş pop yapılamaz");
            return null;
        }
    }

    public void push(Object eklenecekEleman){
        liste.add(eklenecekEleman);
    }

    public void yazdir(){
        System.out.println("************** YIĞIN İÇERİĞİ **************");
        for(int i=0; i<liste.size(); i++){
            System.out.println(i+" indekste :" + liste.get(i));
        }
    }
}
