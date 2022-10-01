package day03;

import java.util.Scanner;

public class Q07_SwitchCase {
    public static void main(String[] args) {
        //Girilen 3 haneli bir sayının okunusunu yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif bir sayı giriniz : ");
        int sayi = scan.nextInt();

        int YüzlerBasamağı = sayi/100, OnlarBasamagı = (sayi/10)%10, BirlerBasamagı=sayi%10;
        if (sayi>99 && sayi<1000 ){
            switch (YüzlerBasamağı){
                case 0 :
                    System.out.println("sıfır");break;
                case 1 :
                    System.out.println("yüz");break;
                case 2 :
                    System.out.println("İkiyüz");break;
                case 3 :
                    System.out.println("Üçyüz");break;
                case 4 :
                    System.out.println("dörtyüz");break;
                case 5 :
                    System.out.println("beşyüz");break;
                case 6 :
                    System.out.println("altıyüz");break;
                case 7 :
                    System.out.println("yediyüz");break;
                case 8 :
                    System.out.println("sekizyüz");break;
                case 9 :
                    System.out.println("dokuzyuz");break;

            }
            switch (OnlarBasamagı){
                case 0 :
                    System.out.println("sıfır");break;
                case 1 :
                    System.out.println("on");break;
                case 2 :
                    System.out.println("yirmi");break;
                case 3 :
                    System.out.println("otuz");break;
                case 4 :
                    System.out.println("kırk");break;
                case 5 :
                    System.out.println("elli");break;
                case 6 :
                    System.out.println("altmış");break;
                case 7 :
                    System.out.println("yetmiş");break;
                case 8 :
                    System.out.println("seksen");break;
                case 9 :
                    System.out.println("doksan");break;

            }
            switch (BirlerBasamagı){
                case 0 :
                    System.out.println("sıfır");break;
                case 1 :
                    System.out.println("bir");break;
                case 2 :
                    System.out.println("iki");break;
                case 3 :
                    System.out.println("üç");break;
                case 4 :
                    System.out.println("dört");break;
                case 5 :
                    System.out.println("beş");break;
                case 6 :
                    System.out.println("altı");break;
                case 7 :
                    System.out.println("yedi");break;
                case 8 :
                    System.out.println("sekiz");break;
                case 9 :
                    System.out.println("dokuz");break;

                default:
                    System.out.println("hatalı giriş");
            }












        }

    }
}
