package j03_ScannerClass_TypeCasting.task3;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("isim Soyisim : ");
        String isimSoyisim = input.nextLine();
        System.out.println("Yaşınız : ");
        int Yas = input.nextInt();
        System.out.println("kilo : ");
        int kilo = input.nextInt();
        System.out.println("Boy : ");
        int boy = input.nextInt();
        System.out.println("Spor salonuna devam edeceğiniz süre : ");
        int ay = input.nextInt();
        System.out.println("Sayın " +isimSoyisim+ " " +Yas+ " " +kilo+ " " + boy+" salon ücretiniz :"+ ay*20+ "&");




    }
}
