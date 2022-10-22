package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

       //Task-->Girilen tamsayının tam bolen sayısını print eden code create edınız?
       //yani 20 -1,2,4,5,10,20 nin 6 tane tam bolenı vardır
        //30-->1,2,3,4,5,6,10,15,30: 8 tane bolun
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bölen sayısını ogrenmek ıstedıgınız sayıyı gırınız : ");
        int sayi = scan.nextInt();
        int bölenSayi = 1;
        int tamBölenAdedi=0;

        while (bölenSayi<=sayi){
            if (sayi%bölenSayi==0){//sayi bolenSayiya tam bolunuyor
                tamBölenAdedi++;

            }
            bölenSayi++;//Loop sonsuza dusmeemsı ıcın ve dıger sayılarıN boldugu kontrol etmek için yazıldı.
        }

        System.out.println("agam girdigin" +sayi+ " nın " +tamBölenAdedi+ " kadar tam bolenı vardır");



















    }



}
