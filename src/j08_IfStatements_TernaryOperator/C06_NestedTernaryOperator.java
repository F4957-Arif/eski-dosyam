package j08_IfStatements_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {

/*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi Giriniz = ");
        int sayi = scan.nextInt();

        System.out.println(sayi >= 0 ? (sayi < 10 ? "Rakam" : " Pozitif") : "Negatif");



    }
}
