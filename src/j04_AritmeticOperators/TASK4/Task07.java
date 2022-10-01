package j04_AritmeticOperators.TASK4;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Task07 {

	public static void main(String[] args) {
		
		/* Soru 5:
		 * 120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("İşlem için sayı giriniz = ");
		int sayi1 = 120;
		int sayi2 = 60;
		int sayi3 = 10;
		int sayi4 = 20;
		int sayi5 = 40;

		System.out.println(sayi1/sayi2*sayi3+sayi4-sayi5);

	}

}
