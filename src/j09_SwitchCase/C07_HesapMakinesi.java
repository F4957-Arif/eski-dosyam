package j09_SwitchCase;

import java.util.Scanner;

public class C07_HesapMakinesi {

    public static void main(String[] args) {

Scanner scan= new Scanner(System.in);
        System.out.println("Hesap makineme hoş geldiniz........");
        System.out.println("Hesaplamak istedıgınız iki sayıyı giriniz: ");
        int sayiBir = scan.nextInt();
        int sayiİki = scan.nextInt();
        System.out.println("yapmak işediğiniz işlemi seçiniz : \nBölme işlemi için = / \nÇarpma işlemi için = * \nToplama işlemi için = + \nÇıkartma işlemi için = -");
        char islem = scan.next().charAt(0);
        int sonuç;

        switch (islem){
            case '+':
                sonuç =sayiBir+sayiİki;
                System.out.println(sayiBir+ "+" +sayiİki + " =" + sonuç);

                break;
            case '-':
                sonuç =sayiBir-sayiİki;
                System.out.println(sayiBir+ "-" +sayiİki + " =" + sonuç);

                break;
            case '*':
                sonuç =sayiBir*sayiİki;
                System.out.println(sayiBir+ "*" +sayiİki + " =" + sonuç);

                break;

            case '/':
                sonuç =sayiBir/sayiİki;
                System.out.println(sayiBir+ "/" +sayiİki + " =" + sonuç);


            default:
                System.out.println("Hatalı işilem sectınız ");



        }

















    }
}
