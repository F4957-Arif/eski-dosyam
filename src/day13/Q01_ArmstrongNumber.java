package day13;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    public static void main(String[] args) {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */
        /*1. cozum
        public static void armstrongSayi(int a) {
			String str = String.valueOf(a);
			int toplam=0;
			for(int i = 0;i<=str.length()-1;i++) {
				toplam+=(int)Math.pow(Integer.parseInt(""+str.charAt(i)), str.length());
			}
			System.out.println(toplam==a? "Armstrong sayı" : "Armstrong sayı değil");
		}
Collap
         */
      /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanArmstrong(sayi);
    }

    private static void girilenSayiyaKadarOlanArmstrong(int sayi) {
        for (int i = 0; i < sayi; i++) {
            armstrong(i);
        }
    }

    private static void armstrong(int sayi) {
        int sayininKupleriToplami = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = sayi;
        while (sayi > 0) {
            basamaktakiSayi = sayi % 10;  //her bir rakama erismek icin
            sayininKupleriToplami += (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            sayi = sayi / 10; //basamak sayisini eksiltmek icin
        }
        if (girilenSayi == sayininKupleriToplami) {
            System.out.println(girilenSayi + " sayisi armstrong sayidir");
        } else System.out.println(girilenSayi + " sayisi armstrong sayi degildir");
    }
}