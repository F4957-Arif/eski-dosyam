package j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scan =new Scanner(System.in);
        char girKar;
        do {
            System.out.print("Bir karakter giriniz : ");
            girKar = scan.next().charAt(0);
            System.out.println(girKar == 'x' ? "jAVATAR" : "javaCAN");
        }while (girKar != 'x');
    }




    }

