package j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int dongu =0;
        while (dongu<sayi){
            if (dongu %2!=0) System.out.println(" "+dongu);
            dongu++;}}}

