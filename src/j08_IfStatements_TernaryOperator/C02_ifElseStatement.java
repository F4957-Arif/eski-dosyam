package j08_IfStatements_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        //Girilen yaşın 18 den buyuklugunu kontrel eden bir kod creat edınız?

        //Scanner Sc = new Scanner(System.in);
        //System.out.println("Yasınız giriniz : ");
        //int yas = Sc.nextInt();
        //if (yas > 18)
        {
           // System.out.println("yasınız 18 den büyüktür ");
        }

        //Girilen sayınıın 18 den buyuklugunu kontrol eden code dreat ediniz 18 den küçük ise ehliyet alamazsınız print ediniz


        Scanner Scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int yas = Scan.nextInt();
        if (yas >= 18){//yas 18 den buyuk ve esıt olmasını saglar
            System.out.println("yasınız 18 den kucuk degil");

        }else {
            System.out.println("ehliyet alamzsınız ");//if sartı saglamazsa  yas 18 den buyuk ve esit degil kucuk
        }

    }
}
