package com.aliosmanarslan.abstractinterface;

import java.util.ArrayList;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 15.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description:
 */

public class CokluKalitimGerekliligi {

    public static void main(String[] args) {
        MuslumBaba muslum = new MuslumBaba();
        muslum.sahnedeDansEt();
        muslum.sahnedeSigaraIc();

        PopkSarkiciOzellikleri popSarkici1 = new Tarkan();
        PopkSarkiciOzellikleri popSarkici2 = new Hadise();

        PopkSarkiciOzellikleri dizi[] = new PopkSarkiciOzellikleri[5];
        dizi[0] = popSarkici1;
        dizi[1] = popSarkici2;

        ArrayList<PopkSarkiciOzellikleri> sarkicilar = new ArrayList<>();
        sarkicilar.add(popSarkici1);
        sarkicilar.add(popSarkici2);

        popSarkici1.sahnedeDansEt();

    }

}


abstract class Sarkici implements Kisi{
    abstract void sarkiSoyle();
}

interface ArabeskSarkiciOzellikleri {
    void sahnedeSigaraIc();

}

interface PopkSarkiciOzellikleri {
    void sahnedeDansEt();
    void duetYap();
    static final int yas = 50; //default static ve final
}

class Tarkan implements PopkSarkiciOzellikleri{

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}

class Hadise implements PopkSarkiciOzellikleri{

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}

class ArabeksSarkici extends Sarkici{

    @Override
    void sarkiSoyle() {
        System.out.println("Arabeks şarkıcı şarkı söylüyor");
    }

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }
}

class PopSarkici extends Sarkici{

    @Override
    void sarkiSoyle() {
        System.out.println("Pop şarkıcı şarkı söylüyor");
    }

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }
}

class MuslumBaba implements ArabeskSarkiciOzellikleri, PopkSarkiciOzellikleri {

    @Override
    public void sahnedeSigaraIc() {

    }

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}

interface Kisi{
    void yemekYe();
    void sporYap();
}

interface OgrenciOzellikleri extends Kisi, UniversiteOgrencisi{
    void dersCalis();
    void okulaGit();

}
interface UniversiteOgrencisi{
    void finallereCalis();
}

class Student implements OgrenciOzellikleri{

    @Override
    public void yemekYe() {

    }

    @Override
    public void sporYap() {

    }

    @Override
    public void dersCalis() {

    }

    @Override
    public void okulaGit() {

    }

    @Override
    public void finallereCalis() {

    }
}