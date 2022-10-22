package day07;

import java.util.Scanner;

public class Q01_WhileDowhile {
    public static void main(String[] args) {
      // Scanner sc= new Scanner(System.in);
      //  System.out.print("Bir Sayı Girin: ");
      //  int num=sc.nextInt();
      //  int adet = 0,toplam=0;
      //  while(num != 0)
      //  {
      //      toplam=(num%10)+toplam;
      //      num /= 10;
      //      ++adet;
      //  }
      //  System.out.println("Basamak Toplamı: " + toplam);
    //
        System.out.println("***do while*****");
        int sayi =2562;
        System.out.println(basamakToplami(sayi));
    }
    private static int basamakToplami(int sayi) {
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        return toplam;

    }
}
//do while



//for ile











