package j12_Loops.L01_ForLoop.TASK.TasksÖdev;

import java.util.Scanner;

public class ödev05 {

    public static void main(String[] args) {
         /*
        powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        powerOfThree(sayi);
        System.out.println(powerOfThree(sayi));

    }

    private static boolean powerOfThree(int sayi) {
        boolean sonuc = true;
        for (int i = 3; i <sayi ; i*=3) {
            if (sayi%i==0){
              sonuc=true;
            }else{
                sonuc=false;
            }

        }

     return sonuc ;
    }
}
