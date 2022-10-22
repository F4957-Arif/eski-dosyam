package day07;

import java.util.Scanner;

public class Q03_NestedForLoop {
    public static void main(String[] args) {
        //Girilen bir sayiya kadar olan sayılardan sadece tek olanlarını ekrana yazdırın
        //girilen sayi dahil(tek ise), tek olanların adetlerını yazdırınız

        Scanner sc =new Scanner(System.in);
        System.out.println("Bir sayı giriniz"); int sayi=sc.nextInt();

        int tane=0;
        for (int i=1; i<=sayi; i+=2){
            System.out.print(i+" ");
            tane++;
        }
        System.out.print(tane+" tane tek sayı vardır");
/*
 Scanner scanner = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scanner.nextInt();
        int count = 0;//sayac tek olan sayilari sayan degisken
        while(sayi>0){
            if(sayi%2==1){
                System.out.print(sayi + " ");
                    count++;
            }
            sayi--;
        }
        System.out.println();
        System.out.println("count = " + count);
    }

 Scanner scanner = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scanner.nextInt();
        int count = 0;//sayac tek olan sayilari sayan degisken
        while(sayi>0){
            if(sayi%2==1){
                System.out.print(sayi + " ");
                    count++;
            }
            sayi--;
        }
        System.out.println();
        System.out.println("count = " + count);
    }

 */



    }
}
