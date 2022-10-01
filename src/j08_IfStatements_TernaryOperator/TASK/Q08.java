package j08_IfStatements_TernaryOperator.TASK;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("İndirim Sorgulama");

        System.out.println("Ürün Adet Bilgisini Giriniz = ");
        int adet = input.nextInt();

        System.out.println("Liste Fiyatı Giriniz = ");
        double listeFiyati = input.nextDouble();

        System.out.println("Müşteri Kartınız var mı? Evet ise 'E' Hayır ise 'H' seçiniz");
        char kart = input.next().toUpperCase().charAt(0);

        if (kart=='E'){
            if (adet>10){
                System.out.println("% 20 indirim ile ücret = " + ((listeFiyati*adet) - (listeFiyati*adet* 0.20))+"TL dir.");
            }else
                System.out.println("% 15 indirim ile ücret = " +((listeFiyati * adet)-(listeFiyati * adet * 0.15))+"TL dir");

        } else if (adet>10) {
            System.out.println("% 15 indirim için ile ücret = " +((listeFiyati * adet)-(listeFiyati * adet * 0.15))+"TL dir" );

        }else System.out.println("% 10 indirimli ücret = " +((listeFiyati*adet)-(listeFiyati * adet * 0.10))+"TL dir");


    }

}
