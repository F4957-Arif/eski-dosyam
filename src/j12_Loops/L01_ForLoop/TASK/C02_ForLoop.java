package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class C02_ForLoop {

    //Task--> girilen sayıdan 100 e kadar 4 ün katı tamsayıları print eden code create edınız
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tam sayi giriniz :");
        int sayi = scan.nextInt();
        if (sayi>100){
            System.out.println("Lütfen 100 den küçük bir sayi giriniz :");
        }else{
            for (int i = sayi; i < 100; i++){
                if (i%4==0){
                    System.out.println(i+ " ");
                }
            }
        }



    }

}
