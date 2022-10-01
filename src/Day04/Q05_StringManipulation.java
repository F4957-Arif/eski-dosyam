package Day04;

import java.util.Scanner;

public class Q05_StringManipulation {

    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cümle olusturmak ıcın bir kelıme giriniz : " );
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        String word3 = scan.nextLine();
        String word4 = scan.nextLine();
        System.out.println(word1.substring(0,1).toUpperCase()+word1.substring(1) + " " + word2 + " " + word3 + " " +word4+ ".");



































    }
}
