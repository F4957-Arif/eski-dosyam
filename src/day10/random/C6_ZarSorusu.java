package day10.random;

public class C6_ZarSorusu {
    public static void main(String[] args) {
        /*
        2 tane atılan zarın toplamlarının 9 olması dueumunda "kazandınız" yazısınız yazdırın, aksi tajdırde
        "tekrar deneyınız"yazmalı



      1.yol
        int toplam=0;
        for (int i = 0; i < 2; i++) {

        toplam+=(int)(Math.random()*6)+1;
        }
        System.out.println(toplam==9?"kazandınız":"tekrar deneyin");
         */
  //      int zar1=(int)(Math.random()*((6 - 1) + 1) + 1);
  //      int zar2=(int)(Math.random()*((6 - 1) + 1) + 1);
   //     System.out.println((zar1 + zar2 == 9) ? "Kazandınız" : "Tekrar deneyiniz");

        int min =1;
        int max=6;
        int zar1=(int) (Math.random()*((max-min)+1))+min;
        int zar2 =(int) (Math.random()*((max-min)+1))+min;
        System.out.println("zar1 = " + zar1);
        System.out.println("zar2 = " + zar2);
        int toplam=zar1+zar2;

        if (toplam==9){
            System.out.println("\"sonuc\" = " + "kazandınız");
        }else {
            System.out.println("\"sonuc\" = " + "kaybettınız");
        }
        }

}

