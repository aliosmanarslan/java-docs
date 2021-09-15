package com.aliosmanarslan.azkod_cokis;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 11.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: none
 */

public class KonuyuToplayalim {
    public static void main(String[] args) {

        Canli canli = new Canli();
        canli.adiniSoyle();

        Canli kartal = new Kartal();
        kartal.adiniSoyle();
        ((Kartal)kartal).uc(); //downcasting

        Canli panda = new Panda();
        panda.adiniSoyle();
        ((Panda)panda).oyna(); //downcasting

        Panda panda2 = (Panda) panda;
        panda2.oyna();
    }
}

class Canli{

    public void adiniSoyle(){
        System.out.println("Ben bir hayvan sınıfı nesnesiyim");
    }
}

class Kartal extends Canli{
    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir kartal sınıfı nesnesiyim");
    }

    public void uc(){
        System.out.println("Ben uçabilirim");
    }
}

class Panda extends Canli{
    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir panda sınıfı nesnesiyim");
    }

    public void oyna(){
        System.out.println("Ben oynamayı çok severim");
    }
}