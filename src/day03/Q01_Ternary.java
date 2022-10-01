package day03;

import java.util.Scanner;

public class Q01_Ternary {

    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */


        double fiyat = 25;

        String sonuç = fiyat<10 ? "ucuz" : fiyat<20 ? "Normal" : "pahalı";
        System.out.println("sonuç : " +sonuç);







    }
}
