package day03;

import java.util.Scanner;

public class Q01_NestedIfStatemen {

    public static void main(String[] args) {
        /*
    Kullanici dan yas bilgisini alarak

       oy kullanma yasi :
      age >= 18  ==> oy kullanmaya uygun
      age >= 70  ==> uc kez oy kullanabilir
      70 > age >=50 ==> iki kez oy kullanabilir
      50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

    */
        Scanner input = new Scanner(System.in);
        System.out.println("yaşınızı giriniz : ");
        int age = input.nextInt();
        if (age>=18){
            System.out.println("Yaşınız oy kullanmaya uygun ");
            if (age>=70){
                System.out.println("3 kez uy kullanabılırsınız");
            } else if (age>=50) {
                System.out.println("2 kez oy kullanbılirsiniz");

            }else {//50>aga>=18
                System.out.println("1 kez oy kullanbılrısıniz");
            }
        }else System.out.println("yaşınız oy kullanmaya uygun değildir -16");













    }
}
