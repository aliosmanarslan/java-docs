package com.aliosmanarslan.azkod_cokis.Alistirma;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 14.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description:
 */

public class MuzikKanali extends Kanal {

    private String muzikTuru;

    public MuzikKanali(String adi, int kanalNo, String muzikTuru) {
        super(adi, kanalNo);
        this.muzikTuru = muzikTuru;
    }
}
