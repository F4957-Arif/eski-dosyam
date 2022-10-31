package day11;

public class Q05_Varargs01 {
    public static void main(String[] args) {
        //istedıgınız kadar sayı girdiginizde
        //toplamı bize veren method yazalım



toplama(5,9,-12,0,100,8);
    }

    private static void toplama(int ... sayi) {
        int toplam=0;
        for (int each:sayi) {
            toplam+=each;

        }
        System.out.println(toplam);

    }
}
