package com.aliosmanarslan.azkod_cokis.Alistirma;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 14.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description:
 */

public class HaberKanali extends Kanal {

    private String haberTuru;

    public HaberKanali(String adi, int kanalNo, String haberTuru) {
        super(adi, kanalNo);
        this.haberTuru = haberTuru;
    }
}
