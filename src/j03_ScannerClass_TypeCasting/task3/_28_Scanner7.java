package j03_ScannerClass_TypeCasting.task3;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir banka hesabiniz var mi? varsa True yoksa False giriniz");
        Boolean BankaHesabi = input.nextBoolean();
        System.out.println("BankaHesabı :" +BankaHesabi);



    }
}
