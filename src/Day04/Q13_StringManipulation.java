package Day04;

import java.util.Scanner;

public class Q13_StringManipulation {

    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println(" 4 harfli String giriniz : ");
        String str = scan.next();
        System.out.println(""+ str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0));
















    }
}
