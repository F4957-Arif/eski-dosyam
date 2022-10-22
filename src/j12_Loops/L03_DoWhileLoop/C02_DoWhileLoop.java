package j12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        //TAsk-->Girilen sayi 17 den küçük ise kazandınız buyuk ıse kaybettınız print
        //eden code do while Loop ile creat ediniz?
        Scanner sc=new Scanner(System.in);
        System.out.println("agam bir sayi giriniz");
        int sayi =0;

        do {




            System.out.println(sayi+" için kazandınız");
            sayi++;
        }while (sayi<17);
        System.out.println(sayi+ "için kaybettiniz ");



    }
}
