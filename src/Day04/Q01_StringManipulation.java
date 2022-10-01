package Day04;

import java.util.Scanner;

public class Q01_StringManipulation  {
    public static void main(String[] args) {
        //Kullanıcıdan ismini ve soyismini girmesını isteyin, sonrasında konsola tam ismini büyük harfler ile yazdırın
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen isim ve Soyisminizi giriniz : ");
        String isim = sc.nextLine(), soyIsim = sc.nextLine();

        String isimSoyIsim = isim.concat(" " +soyIsim).toUpperCase();
        System.out.print("isimSoyIsim : " + isimSoyIsim);












    }
}
