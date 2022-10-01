package j09_SwitchCase.taks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("ayGir = ");
		String ay = scan.next().toLowerCase();
		switch (ay){
			case "ocak" :
			case "mart" :
			case "mayıs" :
			case "temmuz" :
			case "agostos" :
			case "ekim" :
			case "aralık" :
				System.out.println("Girmiş oldugunuz ay 31 gün çeker");
				break;
			case "nisan":
			case "haziran":
			case "eylül" :
			case "kasım" :
				System.out.println("girmiş oldugunuz ay 30 gün çeker");

			case "şubat" :
				System.out.println("Yılınızı giriniz");
				int yil = scan.nextInt();
				if (yil % 4 == 0){
					System.out.println("bu yılda şubat ayı 29 gün çeker");
				}else {
					System.out.println("bu yıl şubay ayı 29 gün ceker");
				}
				break;
			default:
				System.out.println("hatalı işlem yaptınız" +
						"");

		}


	}

}
