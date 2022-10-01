package j03_ScannerClass_TypeCasting.task3;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
 	 Scanner input = new Scanner(System.in);
	 System.out.println("Bir tamsayı giriniz : ");
	 int sayi1 = input.nextInt();
	 System.out.println("İkinci tamsayıyı giriniz : ");
	 int sayi2= input.nextInt();
	 System.out.println("Toplama İşlemi : " +(sayi1+sayi2)+"\nÇıkarma İşlemi :"+(sayi1-sayi2)+"\nÇarpma İşlemi : " + (sayi1*sayi2)+"\nBölme İşlemi :"+(sayi1/sayi2));



	}

}
