package Day04;

import java.util.Scanner;

public class Q10_StringManipulation {

    public static void main(String[] args) {
        /*
  Kullanicidan bir kelime girmesini isteyin.
  * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
  * kelimenin ortasindaki karakteri yazdirin.
  */


        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz : ");
        String s = scan.nextLine();
        char ortancaKrk = s.charAt((s.length() - 1) / 2);
        if (s.length() % 2 == 1 && s.length() >= 3) {
            System.out.println("ortanca karakter :" + ortancaKrk);
        } else
            System.out.println("tek sayida karakter iceren bir kelime giriniz...");










//Farklı bir yol
       /* System.out.println("bir kelime girin");
        String word = scan.nextLine();
        if (word.length() % 2 != 0 && word.length() >= 3) {
            System.out.println(word.substring(word.length() / 2, word.length() / 2 + 1));
        } else System.out.println("girilen kelime çift sayıda karakter içeriyor");
*/


    }
}
