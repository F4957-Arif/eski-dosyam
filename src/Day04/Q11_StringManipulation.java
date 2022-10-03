package Day04;

import java.util.Scanner;

public class Q11_StringManipulation {
    public static void main(String[] args) {

// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz : ");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyadınzıı giriniz :");
        String soyad = scan.nextLine();
        if (isim.length()>soyad.length()){
            System.out.println(" uzun olan isminizdir :" + isim);

        } else if (soyad.length()>isim.length()) {

            System.out.println("uzun olan soyadınızdır" + soyad);
        } else {
            System.out.println("Ad soyad karekter uzunlugu birbirlerine eşittir");
        }




















     /*   System.out.println("Lutfen isminizi tanimlayiniz: ");
        String a= scan.nextLine();
        System.out.println("Lutfen soyisminizi tanimlayiniz: ");
        String b= scan.nextLine();​
        if (a.length()>b.length()){
            System.out.println("Uzun olan ifade: "+a);
        }else if (b.length()>a.length()){
            System.out.println("Uzun olan ifade: "+b);
       }else System.out.println("İki ifadenin de uzunlugu esittir \n( " +a+" ) ( "+b+" )");

*/
    }
}
