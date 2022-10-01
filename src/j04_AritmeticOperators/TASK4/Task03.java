package j04_AritmeticOperators.TASK4;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner Scan = new Scanner(System.in);
		System.out.println("3 basamaklı bir sayı giriniz");
		int abc = 123;
		System.out.println("İlk rakam ve son rakamlarının toplamı = "+(abc/100)+"+"+(abc%10)+"=" +((abc/100)+(abc%10)));
		

		
	}

}
