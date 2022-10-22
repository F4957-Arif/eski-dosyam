package j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println();
        Random rand = new Random();
        int sayi = rand.nextInt(100);
        int count = 1;
        int minTahmin = 1;
        int maxTahmin = 100;
        System.out.print("1-100 arasına bir sayı giriniz : ");
        int tahmin = scan.nextInt();
        while (tahmin != sayi) {
            if (tahmin < sayi) {
                if (tahmin > minTahmin) {
                    minTahmin = tahmin;
                }
                System.out.print("Olmadı :(  Küçük girdiniz. " + minTahmin + " ile " + maxTahmin + " Arasında Bir Sayı Giriniz!.. ->> ");
            } else {
                if (tahmin < maxTahmin) {
                    maxTahmin = tahmin;
                }
                System.out.print("Olmadı :(  Büyük girdiniz. " + minTahmin + " ile " + maxTahmin + " Arasında Bir Sayı Giriniz!.. ->> ");
            }
            tahmin = scan.nextInt();
            count++;
        }
        System.out.println("Tebrikler " + count + ". tahmininizde buldunuz");

    }

}
