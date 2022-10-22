package j16_ArrayList.Tasklar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {

    static List<String> urun = new ArrayList<>(Arrays.asList("Domates", "Biber", "Patlican", "Cilek", "Kavun"));
    static List<Double> fiyat = new ArrayList<>(Arrays.asList(1.5, 1.3, 3.10, 3.50, 2.10));
    static  List<String> sepeturun=new ArrayList<>();
    static  List<Double> sepeturunfiyat=new ArrayList<>();
    static double toplamborc=0;
    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        Scanner scan = new Scanner(System.in);
        String dongudevam = "";
        int urunnosecim = 0;
        double kilosecim = 0;
        do {
            System.out.println("Urun numarasi Urun Listesi Ve Fiyatlarimiz");
            for (int i = 0; i < urun.size(); i++) {
                System.out.println(i + "------------->" + urun.get(i) + "\t\t\t" + fiyat.get(i));
            }
            System.out.println("Kac numarali urunden almak istiyorsunuz");
            urunnosecim = scan.nextInt();
            System.out.println("Kac kilo almak istiyorsunuz");
            kilosecim = scan.nextDouble();
            sepeturun(urunnosecim,kilosecim);
            System.out.println("Sepetinizdeki Urunler");
            for(int i=0;i<sepeturun.size();i++){
                System.out.println(sepeturun.get(i)+"\t\t"+sepeturunfiyat.get(i)+" Kilo");
            }
            System.out.println("Alisverise Devam etmek istiyor musunuz Evet ise \"E\" Hayir ise \"H\" giriniz.");
            dongudevam = scan.next();
        } while (dongudevam.equalsIgnoreCase("e"));
        System.out.println("Toplam odemeniz gereken miktar :"+toplamborc+" Tl dir.");
    }
    public static void sepeturun(int urunnosecim,double kilosecim){
        sepeturun.add(urun.get(urunnosecim));
        sepeturunfiyat.add(kilosecim);
        toplamborc+=(fiyat.get(urunnosecim)*kilosecim);
    }

/*
Scanner scan = new Scanner(System.in);
        String urun[] = {"1-Domates", "2-Salatalik","3-Kabak", "4-Elma", "5-Portakal" };
        double fiyat [] = {15, 20, 25, 24, 26};
        boolean devamMi = true;
        int secim;
        double kilo;
        double toplamTutar = 0;
        while(devamMi){
            System.out.println(Arrays.toString(urun));
            System.out.println("Lütfen almak istediginiz ürün numarasini giriniz: ");
            secim = scan.nextInt();
            System.out.println("Lütfen almak istediginiz miktarini 'kg' olarak giriniz: ");
            kilo=scan.nextDouble();
            toplamTutar+=kilo*fiyat[secim+1];
            System.out.println("Baska ürün almak istiyor musunuz? Evet icin '1', hayir icin '2' : ");
            secim=scan.nextInt();
            if (secim==2) devamMi = false;
        }
        System.out.println("Ödemeniz gereken toplamTutar = " + toplamTutar + " TL'dir");
 */


}

