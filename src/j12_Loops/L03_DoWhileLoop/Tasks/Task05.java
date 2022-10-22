package j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */

		Scanner sc = new Scanner(System.in);
		System.out.println(" isminiz : ");
		String  isim = sc.next().toLowerCase();
		System.out.println(" soyisminiz : ");
		String  soyIsim = sc.next().toLowerCase();
		String toplam=isim+soyIsim;
		int bos=0;
		while (bos<toplam.length()) {
			System.out.print(toplam.charAt(bos)+" ");
			bos++;
		}

/*
  Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soy = scan.nextLine();
        String adsyoad = isim.concat(soy);
        int dongu = 0;
        while (dongu < (adsyoad.length())) {
            System.out.print(adsyoad.charAt(dongu) + " ");
            dongu++;
 */
	}

}
