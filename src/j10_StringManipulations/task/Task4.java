package j10_StringManipulations.task;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
 Task->
 Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
 ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
 name1= mehmet
 name2= ahmet
 Print ==> mehahmetmet
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk kelimeyi yazınız : ");
        String str1 = scan.nextLine();
        System.out.println("Lütfen ikinci kelimeyi yazınız: ");
        String str2 = scan.nextLine();

        if (str1.length() % 2==0){
            System.out.println(str1.substring(0, str1.length() / 2) + str2 + str1.substring(str1.length() / 2));


        }else {
            System.out.println("kelime2 kelime1 eklenemez ");
        }





















    }
}
