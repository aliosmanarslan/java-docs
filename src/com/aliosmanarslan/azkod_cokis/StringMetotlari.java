package com.aliosmanarslan.azkod_cokis;

import java.util.Locale;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 12.09.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: String Sınıfının Önemli Metotları ve Örnekler
 */

public class StringMetotlari {
    public static void main(String[] args) {

        String isim = "Ali";

        System.out.println(isim.length());              //String in uzunluğunu integer olarak geriye döndürür
        System.out.println(isim.charAt(2));             //2.indexteki string değerini sting olarak geri döndürür
        System.out.println(isim.concat(" Osman"));      //String değerini yeni oluşturduğu yeni string ifade ile birleştirip geri string değer döndürür
        System.out.println(isim.toUpperCase());         //String ifadeyi büyük harfler ile yazar
        System.out.println(isim.toLowerCase());         //String ifadeyi küçük harfler ile yazar

        String isim2 = " Ali";
        System.out.println(isim2.trim());                //String ifadenin başında ve sonundaki boşlukları siler - string poll a yeni blok açar

        String ay1 = "Haziran";
        String ay2 = "Aralık";

        System.out.println(ay1.equals(ay2));                //2 string ifadeyi karşılaştırır, aynı olursa true değer döndürür
        System.out.println(ay1.equalsIgnoreCase(ay2));      //2 string ifadeyi harflerin büyük küçük duyarlılığına BAKMADAN karşılaştırır, aynı olursa true değer döndürür "EyLül" = "eylül" true
        System.out.println(ay1.compareTo(ay2));             //Başlangıçtaki harflerin alfabedeki sıralamasına göre karşılaştırır
        System.out.println(ay1.startsWith("H"));            // H ile mi başlıyor? true
        System.out.println(ay1.endsWith("n"));              // n ile mi bitiyor? true

        System.out.println(ay1.contains("ran"));            //İfadenin içinde "ran" geçiyor mu? true
        System.out.println(ay1.substring(5));               //5.indexten itibaren değerleri bana döndür
        System.out.println(ay1.substring(0,5));             //0 ile 5.index değerlerini bana döndür
        System.out.println(ay1.indexOf("a"));               //a harfinin ilk geçtiği yerin indexini bana ver
        System.out.println(ay1.lastIndexOf("a"));       //a harfinin son geçtiği yerin indexini bana ver

        String sayi = "56";
        System.out.println(Integer.parseInt(sayi)+4);       //String ifadeyi integer a çevirir


    }
}
