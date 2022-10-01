package j03_ScannerClass_TypeCasting.task3;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        Scanner input = new Scanner(System.in);
        System.out.println("Kg cinsinden kilonuzu giriniz : ");
        Byte kilo = input.nextByte();
        System.out.println("kilonuz :" +kilo);




    }
}
