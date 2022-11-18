package Interview_Questıons.Day01;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            String pin="sumeyra12345";
            int girişHakkı=4;

            System.out.println("******Hoşgeldiniz******");


            while (true){
                System.out.println("******Pın kodu giriniz ******");
                String girilenPın=sc.nextLine();
                if (pin.equals(girilenPın)){
                    System.out.println("Basarılı giriş yaptınız ");
                    break;
                }else {
                    System.out.println("yanlıs giriş yaptınız..... ");
                    girişHakkı--;
                    System.out.println("kalan giriş hakkınız " + girişHakkı);
                }if (girişHakkı==0){
                    System.out.println("giriş hakkınız kalmadı üzgünüm sım kart blok oldu ");
                    break;
                }

            }

/*
farklı yol
Scanner scan = new Scanner(System.in);
		String pinKodu = "FatihATAŞ24";
		int giris = 3;
		while(giris >0) {
			System.out.println("Pin kodunuzu giriniz");
			String pin = scan.nextLine();
			giris--;
			if(pin.equals(pinKodu)) {
				System.out.println("Doğru girdiniz");
				break;
			}else {
				System.out.println("Yanlış girdiniz, kalan hakkınız " + giris);
			}
		}
 */

        }


}
