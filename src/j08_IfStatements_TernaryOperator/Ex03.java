package j08_IfStatements_TernaryOperator;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

       /*
       girilen bir yılın artık (leap year) olmasını kontrol eden code create yazınız
       artık yıl:
       kural 1 :4 ile bölünemeyen yıllar artık yıl degıldır
       kural 2 : 4 ile bçlünüp 100 ile bçlünemeyen yıllar artık yıldır
       kural 3 : 4 ' ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece 400 ün katı olan yıllar artık yıllardır
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("girmek istediğiniz yıl : ");
        int yil = sc.nextInt();
        // 4'un katı       100'un katı olmamamsı    400'un katı olması
        if ((yil%4==0)       &&  (yil %100!=0)  ||   (yil%400==0) ){
            System.out.println("girdiğiniz yil artık yıl  :-)");
        }else {
            System.out.println("giridiğinz yıl artık yıl değildir  :-(");
        }








    }
}
