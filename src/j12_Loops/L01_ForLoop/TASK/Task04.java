package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
        Girilen iki sayi arasındakı cift sayiları print eden code create edeınız
         */

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen birinci sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Lütfen ikinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();


        if (sayi1<sayi2){

            for (int i = sayi1; i<sayi2; i++){
                if (i%2==0){
                    System.out.print(i+ " ");
                }
            }





        }else System.out.println("hatalı giriş yaptınız");


/*
baska sekil
         Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz. ");
        int bir = scan.nextInt();
        System.out.println("bir sayı daha giriniz. ");
        int iki = scan.nextInt();

        if (iki > bir) {
            for (int i = bir; i <= iki; i++) {
                if (i % 2 == 0) {
                    System.out.print(i);
                }
            }
        }else if (iki < bir) {
            for (int i = iki; i <= bir; i++) {
                if (i % 2 == 0) {
                    System.out.print(i);
                }
            }
            baska yol-->
            for (int i=(a<b?a:b);i<=(a>b?a:b);i++ ){
            System.out.print(i%2==0?i:" ");
 */




    }//main dısı
}
