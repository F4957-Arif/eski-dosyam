package j04_AritmeticOperators.TASK4;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Saat degerini giriniz = ");
        int saat = input.nextInt();
        System.out.println("dakika degerini giriniz = ");
        int dakika = input.nextInt();
        System.out.println("Saniye degerini giriniz = ");
        int saniye = input.nextInt();
        System.out.println(+saat*3600+dakika*60+saniye +" saniye");

    }
}
