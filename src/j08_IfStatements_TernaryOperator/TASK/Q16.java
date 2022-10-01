package j08_IfStatements_TernaryOperator.TASK;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz : ");
        int num1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        int num2 = scan.nextInt();
        System.out.print("3. Sayıyı giriniz : ");
        int num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3) {
            if (num2 < num3) {
                System.out.println("En büyük sayı num1 = " + num1 + " En küçük sayı num2= " + num2);
            } else {
                System.out.println("En büyük sayı num1 = " + num1 + " En küçük sayı num3 = " + num3);
            }

        }else if (num2>num1 && num2>num3) {
            if (num1<num3) {
                System.out.println("En büyük sayı num2= " + num2 + "En küçük sayı num1 = " +num1 );
            }else {
                System.out.println("En büyük sayı num2= " + num2 + "En küçük sayı num3 = " +num3 );
            }
        }else {
            if (num1 < num2) {
                System.out.println("En büyük sayı num3= " + num3 + "En küçük sayı num1 = " + num1);
            } else {
                System.out.println("En büyük sayı num3= " + num3 + "En küçük sayı num2 = " + num2);

            }
        }
    }
}

