package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task07_Nested {
    public static void main(String[] args) {
        /*
Task ->
girilen boyuttta bir kare için
 Ekran Çıktısı
    Bir sayı giriniz: 7
    1 0 0 0 0 0 0
    0 1 0 0 0 0 0
    0 0 1 0 0 0 0
    0 0 0 1 0 0 0
    0 0 0 0 1 0 0
    0 0 0 0 0 1 0
    0 0 0 0 0 0 1


    Bir sayi giriniz: 5
    1 0 0 0 0
    0 1 0 0 0
    0 0 1 0 0
    0 0 0 1 0
    0 0 0 0 1

    şekli print eden code create ediniz
 */









 /*
    1. Yol
         Scanner input =new Scanner(System.in);
        System.out.println("Lütfen karenin bir kenarını giriniz : ");
        int sayi = input.nextInt();

        System.out.println("karenin bir kenarını giriniz");

        for (int i = 1; i <= sayi; i++) {
            System.out.println();
            for (int j = 1; j <= sayi; j++) {
                System.out.print((i == j) ? "1" : "0");
            }


        }
*/
/*2.Yol
          for (int i = 0; i <sayi;i++){
            for (int j = 0; j < sayi; j++) {
                if(i==j)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();

  */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen karenin bir kenarını giriniz : ");
        int sayi = input.nextInt();

        System.out.println("karenin bir kenarını giriniz");

        for (int i = 0; i <sayi;i++) {
            for (int j = 0; j < sayi; j++) {
                if (i == j)
                    System.out.print(" 1 ");
                else
                    System.out.print(" 0 ");
            }
            System.out.println();


        }

    }


}
