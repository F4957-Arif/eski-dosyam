package j08_IfStatements_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        /*
        kullanıcıdan 100 üzerinden notunu ısteyim
        Not'u harf sıstemıne cevırıp yazdırın
        50 den kucukse "D"
        =50 < 60 arası "C"
        =60 <80 arası "B"
        =80' in üxeri ise "A"
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam notunu gir : ");
        int not = sc.nextInt();
        if (not<0 || not> 100 ){
            System.out.println("agam negatif ve 100 den buyuk sayı olmaz\nadam gibi birşey yaz :(\n"+"gelmiyim oraya ");
        } else if (not<50) {//50 den kucuk not aşma kontrolu
            System.out.println("D");

        } else if (not<60) {//60 dan kucuk
            System.out.println("C");

        } else if (not<80) {//80 den kucuk
            System.out.println("B");

        }else {//80 den kucuk not alma
            System.out.println("A");

        }


    }
}
