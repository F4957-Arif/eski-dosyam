package j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner scan =new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int carpimSayi = scan.nextInt();
		int carpim = 1;
		while (carpim <= 10) {
			System.out.print("\n" +carpimSayi + " X " + carpim + " = " + carpimSayi*carpim + "  ");
			carpim++;
		}
		System.out.println();


	}

}
