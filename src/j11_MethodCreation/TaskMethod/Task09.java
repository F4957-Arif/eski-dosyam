package j11_MethodCreation.TaskMethod;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir saat giriniz : ");
        int saat = scan.nextInt();
        howManySeconds(saat);

    }

    private static void howManySeconds(int saat) {
        int saniye = 3600*saat;
        System.out.println(saat + "saat " + saniye + "saniyedir ");
    }
}
