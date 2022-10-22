package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01_Okul {
 //   static int sinifMevcudu=0;
  //  static int toplam=0;
    public static void main(String[] args) {
 /*       Scanner sc=new Scanner(System.in);
        System.out.println("Sınıf mevcudunu rakamla giriniz: ");
        sinifMevcudu= sc.nextInt();
        List<Integer> notlar= new ArrayList<>();

        for (int i = 1; i <=sinifMevcudu ; i++){
            System.out.println((i +1)+ ". öğrencinin notunu giriniz:");
            notlar.add(sc.nextInt());
        }
        for( int eleman : notlar) {
            toplam  = toplam+eleman;
        }
        int count=0;
        for ( int i=0; i<notlar.size(); i++ ) {
            if (notlar.get(i)>ortalamaBul()){
                count++;
            }
        }

        System.out.println(sinifMevcudu+" öğrenci içinde ortalamayı geçen öğrenci sayınız: " +count);

    }

    public static int ortalamaBul() {
        int ortalama= toplam / sinifMevcudu;

        return ortalama;

        /*

         */
        /* TASK :
        Bir öğretmenden girmek istediği kadar notu alınız, ve
        ortalamayı geçen öğrenci sayısını bulan code create ediniz.
        */
       Scanner scan=new Scanner(System.in);
        System.out.print("Sınıf mevcudu nedir hocam? ");
        int size = scan.nextInt();
        int sinif[] = new int[size];
        int toplam=0;
        for (int i = 0  ; i<=size-1; i++) {
            System.out.println(i+". öğrencinin notunu giriniz hocam = ");
            sinif[i]=scan.nextInt();
            toplam+=sinif[i];
        }
        int ortalama = toplam / sinif.length;
        System.out.println("Not ortalaması = " + ortalama);
        int gecen = 0;
        for (int i = 0 ; i<=sinif.length-1; i++) {
            if (sinif[i]>=ortalama) gecen++;
            System.out.println(sinif[i]<ortalama? i+ ".öğrenci dersten "+ (sinif[i])+ " notu ile kaldı" :i+ ".öğrenci dersten "+ (sinif[i])+ " notu ile geçti" );
        }
        System.out.println("Sınıfta geçen öğrenci sayısı = " + gecen);
























    }
}
