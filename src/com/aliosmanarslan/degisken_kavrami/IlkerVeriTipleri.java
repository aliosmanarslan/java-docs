package com.aliosmanarslan.degisken_kavrami;

/**
 * Created by: Ali Osman ARSLAN
 * Date: 3.01.2021
 * E-mail: info@aliosmanarslan.com
 * Created with IntelliJ IDEA
 * Description: IlkerVeriTipleri
 */
public class IlkerVeriTipleri {
    public static void main(String[] args) {

        int intVeriTipi = 10;
        double doubleVeriTipi = 7.50;
        short shortVeriTipi = 32767;

        //Bu ifadeler tam sayı veritipi türlerinin özelliklerini yazdırır
        System.out.println("BYTE en küçük değeri : " + Byte.MIN_VALUE + "\nBYTE en büyük değeri : " + Byte.MAX_VALUE + "\nKaç bit : " + Byte.SIZE + "\n");
        System.out.println("SHORT en küçük değeri : " + Short.MIN_VALUE + "\nSHORT en büyük değeri : " + Short.MAX_VALUE + "\nKaç bit : " + Short.SIZE + "\n");
        System.out.println("INT en küçük değeri : " + Integer.MIN_VALUE + "\nINT en büyük değeri : " + Integer.MAX_VALUE + "\nKaç bit : " + Integer.SIZE + "\n");
        System.out.println("LONG en küçük değeri : " + Long.MIN_VALUE + "\nLONG en büyük değeri : " + Long.MAX_VALUE + "\nKaç bit : " + Long.SIZE + "\n");

        //Bu ifadeler ondalıklı veritipi türlerinin özelliklerini yazdırır
        System.out.println("FLOAT en küçük değeri : " + Float.MIN_VALUE + "\nFLOAT en büyük değeri : " + Float.MAX_VALUE + "\nKaç bit : " + Float.SIZE + "\n");
        System.out.println("DOUBLE en küçük değeri : " + Double.MIN_VALUE + "\nDOUBLE en büyük değeri : " + Double.MAX_VALUE + "\nKaç bit : " + Double.SIZE + "\n");

        //char
        char harf = 'r';
        char rakam = '7';
        System.out.println("Harf ve rakam : " + harf + " " + rakam);

        //boolean
        boolean sonuc = true;
        System.out.println("Boolean sonuç değişkenimin değeri : " + sonuc);
        sonuc = false;
        System.out.println("Boolean sonuç değişkenimin değeri : " + sonuc);

    }
}
