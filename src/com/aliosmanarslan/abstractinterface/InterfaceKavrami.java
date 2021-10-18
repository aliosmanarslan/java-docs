package com.aliosmanarslan.abstractinterface;

import java.util.ArrayList;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 15.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description:Interface ( Arayüz, Arabirim ) Kullanmanın Mantığı ve Amacı
 */

public class InterfaceKavrami {
    public static void main(String[] args) {

        Yenilebilir aa = new Elma();
        Yenilebilir bb = new Inek();

        aa.yenmeSekli();

        ArrayList<Yenilebilir> yenilebilenSeyler = new ArrayList<>();
    }
}

interface Yenilebilir{
    void yenmeSekli();
}

class Elma implements Yenilebilir{

    void elmaMetotu(){}

    @Override
    public void yenmeSekli() {

    }
}

class Inek implements Yenilebilir{

    void inekMetotu(){}

    @Override
    public void yenmeSekli() {

    }
}