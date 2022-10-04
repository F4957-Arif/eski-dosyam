package day05;

import java.util.Scanner;

public class C05_MethodCreation {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Kullaniciya kac sayi toplamak istedigini sorun.
//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
//Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
//2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz


      System.out.println("Toplam kaç sayı toplamak ıstersınız : ");
      int adet = scan.nextInt();
      if (adet<2){
          System.out.println("En az iki sayi girmelisniz");
      } else if (adet==2) {
          ikiSayiToplamı();

      } else if (adet==3) {
          üçSayiTopla();

      } else if (adet==4) {
          dörtSayiTopla();
      }else System.out.println("Dörtten fazla sayı girdin hata");


    }//main dısı

    private static void dörtSayiTopla() {
        System.out.println("üç sayi giriniz :");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();
        double sayi4 = scan.nextDouble();
        System.out.println("dört sayini toplamı :" +sayi1+sayi2+sayi3+sayi4);

    }

    private static double üçSayiTopla() {
        System.out.println("üç sayi giriniz :");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();
        return sayi1+sayi2+sayi3;
    }

    private static double ikiSayiToplamı() {

        System.out.println("iki sayi giriniz :");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        return sayi1+sayi2;
    }


}
