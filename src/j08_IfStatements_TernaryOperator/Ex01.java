package j08_IfStatements_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        //TASK -> girilen bir sayının negatif pozitifliğini kontrol ediniz
        Scanner Sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = Sc.nextInt();
        if (sayi>0){//sayının sıfırdan buyuk olması sartına baglı
            System.out.println("girilen sayı pozitif");
        } else if (sayi < 0){//sayının sıfırdan kucuk olması sartına baglı
            System.out.println("girilen sayi negatif");
        }else {//sayı notr
            System.out.println("girilen sayı sıfır");
        }


    }
}
