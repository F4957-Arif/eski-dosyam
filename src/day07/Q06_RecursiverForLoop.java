package day07;

import java.util.Scanner;

public class Q06_RecursiverForLoop {
    public static void main(String[] args) {
      /*  Problem Tanımı
  Verilen iki sayının kombinasyonunu bulan kodu yazınız.
  Hatırlatma C(n,r) = n! / (r!(n-r)!)

  Verilen iki sayının permütasyonunu bulan kodu yazınız.
  Hatırlatma P(n,r) = n! / (n-r)!

  Ekran Çıktısı
  Birinci sayıyı giriniz: 15
  Ikinci sayıyı giriniz: 4
  Kombinasyon: 1365
  permütasyon: 32760

  Birinci sayıyı giriniz: 5
  Ikinci sayıyı giriniz: 3
  Kombinasyon: 10
  permütasyon: 60
*/
        Scanner scan =new Scanner(System.in);
        System.out.print("n degeri : ");
        long n= scan.nextLong();
        System.out.print("r degeri : ");
        long r = scan.nextLong();
        System.out.println("kmobinasyon(n,r) = " + kmobinasyon(n, r));
        System.out.println("permutasyon(n,r) = " + permutasyon(n, r));


    }
    public static long faktoriyel(long sayi){
        long faktSonuç=1;
        for (int i = 1; i <=sayi ; i++) {
            faktSonuç=faktSonuç*i;//faktSonuc*=i;
        }
        return faktSonuç;
    }

    private static long permutasyon(long n, long r) {
        if (n>0 && r>0 && n>=r){
            return faktoriyel(n)/faktoriyel(n-r);

        }else return 0;
    }

    private static long kmobinasyon(long n, long r) {
        if (n>0 && r>0 && n>=r){
            return faktoriyel(n)/(faktoriyel(n-r)*faktoriyel(r));

        }else return 0;
        /*
        System.out.println("ilk sayıyı giriniz : ");
		long i = scan.nextLong();
		System.out.println("İkinci sayıyı giriniz : ");
		long j = scan.nextLong();
		long per = (faktor(i)/(faktor(i-j)));
		System.out.println("girdiğiniz sayıların permütasyonu : " + per);
		long kom = (faktor (i)/(faktor(j)*faktor(i-j)));
		System.out.println("girdiğiniz sayıların permütasyonu : " + kom);


	}
	public static long faktor(long a) {
		long fakt = 1;
		for (long i = a ; i>=1 ; i-- ) {
			fakt *= i;
		}
		return fakt;
	}
         */
    }
}
