package j08_IfStatements_TernaryOperator.TASK;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz : ");
        int yas = scan.nextInt();
        if (yas > 18) {
            System.out.print("Kilonuzu giriniz : ");
            int kilo2=scan.nextInt();
            if (kilo2>=50) {
                System.out.println("Kan bağışı yapabilirsiniz");
            }else {
                System.out.println("Kilonuzdan dolayı Kan bağışı yapamazsınız ");
            }
        }else {
            System.out.println("Yaşınızdan dolayı kan bağışı yapamazsınız .");
        }

    }

}
