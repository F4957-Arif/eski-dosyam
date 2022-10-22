package day07;

import java.util.Scanner;

public class Q05_ForLoop {
    /* Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);


        int sayiToplam = 0;
        int adet = 0;
        while (sayiToplam<=100) {
            System.out.print("Sayı giriniz : ");
            int num = scan.nextInt();
            sayiToplam+=num;
            System.out.println("sayıların toplamı = " + sayiToplam);
            adet++;
        }
        System.out.println(adet + "kere sayı girdin Bu kadar sayı yeter. Sayı toplamları = " + sayiToplam);

/*

Scanner scan = new Scanner(System.in);
        int toplam=0;
        int count=0;
        for (int i = Integer.MIN_VALUE; i <Integer.MAX_VALUE; i++) {
            System.out.println("Bir sayı giriniz");
            toplam+=scan.nextInt();
            count++;
            if(toplam>=100)
                break;
        }
        System.out.println(count+" tane sayı girdin! Yeter!!");
 */
        /*

         */

    }
}
