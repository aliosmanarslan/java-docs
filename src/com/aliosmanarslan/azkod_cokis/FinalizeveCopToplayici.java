package com.aliosmanarslan.azkod_cokis;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 12.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: Object Sınıfı Metotlarından finalize Metotu ve Garbage Collector
 */

public class FinalizeveCopToplayici {
    public static void main(String[] args) {

        A nesne1 = new A(10);
        A nesne2 = new A(15);

        nesne1 = nesne2;

        for(int i=0; i<100; i++){
            nesne1 = new A(500);

            if(i == 10){
                System.gc();
            }
        }
    }
}

class A{

    int i;

    public A(int parametre){
        this.i = parametre;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize metotu tetiklendi");
    }
}