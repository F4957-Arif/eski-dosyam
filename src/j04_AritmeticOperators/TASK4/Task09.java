package j04_AritmeticOperators.TASK4;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İnek sayısını giriniz = ");
        int inek = input.nextInt();
        System.out.println("koyun sayısnı giriniz = ");
        int koyun = input.nextInt();
        System.out.println("tavuk sayısnı giriniz = ");
        int tavuk = input.nextInt();
        System.out.println("tüm hayvanların toplam ayak sayıs = " +(4*(inek+koyun)+tavuk*2));




    }

}
