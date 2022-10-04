package day05;

import java.util.Scanner;

public class Q04_MethodCreationn {

    /*
Kullanicidan bir tam sayi alin.
Bu sayinin negatif veya pozitif oldugunu,
tek mi cift mi oldugunu ve
uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
100'den kucukse sadece birler basamagini yazdirin.
*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen sayi giriniz"); int sayi=sc.nextInt();

        negatifPozitif(sayi);
        System.out.println(Q02_MethodCreation.sayioluştur(sayi));
        ucBasamakli(sayi);

    }

    private static void ucBasamakli(int sayi) {
        int birler=sayi%10, onlar=(sayi/10)%10, yuzler=sayi/100;
        System.out.println(sayi > 99 ? (birler + onlar + yuzler) : "uc veya daha fazla basamaklı sayı giriniz");
    }

    private static void negatifPozitif(int sayi) {
        System.out.println((sayi > 0 && sayi != 0) ? "pozitif" : "negatif");


}
    }