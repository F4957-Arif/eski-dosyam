package j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner scan = new Scanner(System.in);
        int hesap =0;
        int dongu =0;
        do {
            System.out.print("Bir sayi giriniz :");
            int sayi = scan.nextInt();
            if (sayi > hesap) hesap = sayi;
            dongu++;


        }   while (dongu<5);
        System.out.println("Girdiginiz  en büyük sayi " +hesap);




    }
}
