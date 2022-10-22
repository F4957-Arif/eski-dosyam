package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

     //task--> girilen tam sayının rakamları toplamp prınt eden method vreate edeınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz : ");
        int sayi = scan.nextInt();
        rakamTopla(sayi);//method call

        System.out.println("rakamToplamı: " + rakamTopla(sayi));


    }//main dısı

    private static int rakamTopla(int sayi) {
        int rakamToplamı=0;
        while (sayi>0){//sayi 1 olana denk body calısır

            rakamToplamı+=sayi%10;//sayini birler basamagı rakam toplamına eklendı
            sayi/=10;//sayi 1 basamak eksıltı


        }

    return rakamToplamı;
    }


}
