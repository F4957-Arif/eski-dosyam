package Day04;

import java.util.Scanner;

public class Q06_StringManipulation {

    /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem

*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime yazınız : ");
        String kelime = scan.nextLine().toLowerCase();

        if (kelime.startsWith("gh")){
            System.out.println(kelime);

        } else if (kelime.startsWith("g")) {
            System.out.println(kelime.charAt(0)+kelime.substring(2));
        } else if (kelime.charAt(1)=='h') {
            System.out.println(kelime.substring(1));
        }else System.out.println(kelime.substring(2));


    }








}
