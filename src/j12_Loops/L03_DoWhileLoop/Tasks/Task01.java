package j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
        Scanner scan =new Scanner(System.in);
        int toplam=0; int sayıadedi=0;
        while (toplam<=333){
            Scanner sc=new Scanner(System.in);
            System.out.println("Bir sayı giriniz");
            int sayı=sc.nextInt();
            toplam+=sayı;
            sayıadedi++;
        } System.out.println(sayıadedi+" adet sayı girilmiştir"+"\nBu sayıların toplamı :"+toplam);












    }
}
