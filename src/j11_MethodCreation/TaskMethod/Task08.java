package j11_MethodCreation.TaskMethod;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir yil giriniz : ");
        int yil = scan.nextInt();

        artikYilbul(yil);
        System.out.println("Girdiginiz yıl artık yıl mıdır : " +artikYilbul(yil));



    }

    private static boolean artikYilbul(int a) {
        // System.out.println(a % 100 == 0 && a % 400 == 0 && a % 4 == 0 ? (true) : (false));
        boolean artikyil = (a % 100!= 0 && a % 400 == 0 && a % 4 == 0);
        return artikyil;


    }
}
