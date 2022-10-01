package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

         /*
            byte < short < int < long < float < double
            Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
            Java  otomatik olarak yapar.
        */

        boolean basarili = true;
        //boolean basari = basarili;
        //System.out.println("basarılı" + basarili);//True
        //System.out.println("basarı" +basarili);//True
        double d = 17;//double variable 'a 17 atandı k->büyüğe
        System.out.println("d : "+d);//d=17.0 auto widding
        int sayı1 = 33;
        int sayı2 = 7;

        System.out.println(sayı1/sayı2);//4
        /*
        java iki int sayıyı birbirine böldüğünde sonucu int verir eğer bölme işleminde ondalık çıkarsa ondalık kısmı siler.
         */
        byte b = 127;
        int i = b;
        System.out.println("i :"+i );

        int num =  1453;
        double d1 = 17;//num k->büyüğe
        System.out.println("d1 = " +d1);

                    //double->büyük        int->küçük vali kazanır yani büyük olan
        double db =     d1           /       num ; // TRICK->iki farklı data type sayi işleme girerse java
                                                    //kucuk olan data type turu için aw yapar sonucu buyuk olan data type olarak verır

        System.out.println("db : "+db);

        //şimdş tersten gidelim valiyi kaymakam yani büyüğü küçük
        /*
 byte < short < int < long < float < double
 Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
 Java otomatik olarak yapmaz. kod ile teyit ister...

        */
        //TAKS

        //double d2 = 14.53;
        //int num2 = d2;// büyük sayıyı küçük sayıyya atadıgımız ıcın uyarı verdi.

        //şöyle yapılır
        double d2 = 14.53;
        int num2 = (int) d2;
        System.out.println("num2 : "+num2);//14 verir

        //int num3 = 150;
        //byte b1 = num3;// hata verir büyük küöüge sıgmaz

        //şöyle yaparsan
        int num3 = 150;
        byte b1 = (byte) num3;
        System.out.println("b1: "+b1);//-106

        //double d3 = 333;
        //long l = d3;// Hata verdi Double buyukLong kucuk ey double once long olsonra longa atan

        //double d4= 571.444;
        //long l2 =d3;//hata

        //şöyle yaparsak
        double d4 = 571.444;
        long l2 = (long) d4;
        System.out.println("l2 : "+l2);//571 çıkar.

        /* task->
                * Kullanicidan bir character girmesini isteyin ve
                * girilen karakteri ve ascii degerini yazin
                *
         * Ornek : Input  : a
                *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
                *
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("ascci degeri istediğin karekteri gir : ");
        char ch =sc.nextLine().charAt(0);
        int chasciidegeri = ch;
        System.out.println(ch+ "' ın chasciiDegeri : "+chasciidegeri);
        int a = 3;
       // double d = 4.5;























    }
}
