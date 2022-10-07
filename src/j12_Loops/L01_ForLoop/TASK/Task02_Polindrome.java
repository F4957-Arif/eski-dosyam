package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {
       /*
       girilen ifadenin polidrome olmasını kontrol eden method creat edınız ?
       HEr iki yonde okundugunda eşit olan ifadeler
       ey edip adanapide ye gibi
        */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen metin giriniz: ");
        String str = scan.nextLine();

        plindrome(str);// String parametreli method call yaptım
    }//main dışı

    private static void plindrome(String str) {
        String tersSTr="";//boş bir Strıng kutu actım
        for (int i =str.length()-1 ; i>=0  ; i--){
            tersSTr+=str.charAt(i);//str nin i ci karekterını tersStr ye ekler concat yani

        }
        System.out.println("girilen ifadenin tersi :" +tersSTr);
         if (str.equalsIgnoreCase(tersSTr)){
             System.out.println("girilen ifade POLİDROM");
         }  else System.out.println("Girilen ifade POLİDROM degıl");
    }


}
