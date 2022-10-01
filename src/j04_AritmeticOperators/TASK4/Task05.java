package j04_AritmeticOperators.TASK4;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Saniye degerini giriniz = ");
        int time = scan.nextInt();
        System.out.println(time + " Saniye = " + (time/3600) + " saat " + ((time%3600)/60) + " dakika " + (time%60) + " saniye yapar. ") ;


    }

}
