package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task--> Girilen 5 sayinin 10 ile 20 arası hariç diğerlerini code eden code creat edınız

         */
        Scanner scan = new Scanner(System.in);

        int toplam =0;
        for (int i=1; i<=5; i++){
            System.out.print(i+ ". sayiyi giriniz : ");
            int sayi= scan.nextInt();
            if (sayi<=10 || sayi>=20){
                toplam+=sayi;
            }//if sonu

        }//for sonu
        System.out.println("girdiginiz sayıların toplamı "+toplam);

















    }
}
