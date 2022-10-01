package j10_StringManipulations;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C04_Contains {

    public static void main(String[] args) {
        /*
        String içerisinde istenen stringin varlıgını kontrol eden boolen return eder
         */

        /*
        String iersinde istene stringini varlığını kontrol eder boolean return eder..
         */
        String s1="Enise Hanım başarılı bir Qa tester team lead";

        System.out.println(s1.contains("hanım"));//false
        System.out.println(s1.contains("E"));//true
        System.out.println(s1.contains(" "));//true


        String s2="Qa";

        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false
// task-> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz->ternary kullanınız

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cumle=sc.nextLine();
        System.out.println("Aranan ifadeyi giriniz");
        String kelime=sc.nextLine();
        System.out.println(cumle.contains(kelime)?"Aranan kelime mevcuttur":"Aranan kelime mevcut değildir");

    }
}
