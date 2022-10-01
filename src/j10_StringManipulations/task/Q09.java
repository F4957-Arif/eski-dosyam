package j10_StringManipulations.task;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

       //TASK09 : Girilen  bir strngin ilk yarisini print eden code create ediniz
        //ORNEK:
        //INPUT :istanbul
        //OUTPUT :ista


        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen bir metin giriniz  : ");
        String metin = scan.nextLine();
        metin=metin.trim();
        if (metin.length()%2==0){
            System.out.println("Girdiginiz metnin ilk yarıs : " +metin.substring(0,metin.length()/2));
        }else {
            System.out.println("Girdiginiz metin karekter uzunlugu ters sayı yarısı alınamaz");
        }












    }
}
