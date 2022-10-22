package j15_Arrays.Taskyeni;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */
int sayilar []={15,25,22,18,30};
        Arrays.sort(sayilar);
        System.out.println("en buyuk ıkıncı sayi = " + sayilar[sayilar.length - 2]);


    }
}
