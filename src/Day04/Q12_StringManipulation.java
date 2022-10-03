package Day04;

import java.util.Scanner;

public class Q12_StringManipulation {

    public static void main(String[] args) {
// Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
// Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lüfen bir kelime giriniz :");
        String kelime = scan.nextLine();
        System.out.println(kelime.contains(" ") && kelime.length() != 0 ? "Şartlara uygun" : "şartları sağlamıyor");


//FArklı yol
   /*     System.out.println("String giriniz : ");
        String str = scan.nextLine();
        if (str.length()>0) {
            if (str.contains(" ")) {
                System.out.println("içinde boşluk var");
            }else {
                System.out.println("içinde boşluk yok");
            }
        }else {
            System.out.println("string boş");

        */

        /*

        String str = scan.nextLine();
        int bosluk = str.indexOf(" ");
        if(bosluk ==-1  && !str.isEmpty())  //bosluk karakteri yoksa ve string ifadem bos degilse
            System.out.println("sartlara uygun");
        else System.out.println("sartlara uygun degildir");









*/




    }
}
