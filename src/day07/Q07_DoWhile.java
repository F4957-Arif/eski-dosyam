package day07;

import java.util.Scanner;

public class Q07_DoWhile {
    public static void main(String[] args) {
        /*
 Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
 ve x girildiğinde ise "Program bitti" yazan programı yazınız.
 */
        Scanner scan =new Scanner(System.in);

        char c;


        do {
            System.out.println("Lütfen bir metin giriniz :");
c=scan.next().toLowerCase().charAt(0);
            System.out.println("Program calısıyor");

        }while (c!='x');
        System.out.println("Program bitt");


            /*

            Scanner scanner = new Scanner(System.in);
        String line ;
        do {
            System.out.printf("Program çalışıyor");
             line = scanner.nextLine();
        } while (line.toUpperCase() =="X");
        System.out.printf("Program bitti");
             */
    }
}
