package j09_SwitchCase.taks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi1 = scan.nextInt();
        switch ((sayi1 / 10) % 10) {
            case 0:
                System.out.println("Onlar basamağı SIFIRDIR");
                break;
            case 1:
                System.out.println("Onlar basamağı BİRDİR");
                break;
            case 2:
                System.out.println("Onlar basamağı İKİDİR");
                break;
            case 3:
                System.out.println("Onlar basamağı ÜÇTÜR");
                break;
            case 4:
                System.out.println("Onlar basamağı DÖRTTÜR");
                break;
            case 5:
                System.out.println("Onlar basamağı BEŞTİR");
                break;
            case 6:
                System.out.println("Onlar basamağı ALTIDIR");
                break;
            case 7:
                System.out.println("Onlar basamağı YEDİDİR");
                break;
            case 8:
                System.out.println("Onlar basamağı SEKİZDİR");
                break;
            case 9:
                System.out.println("Onlar basamağı DOKUZDUR");
                break;

        }
    }
}
