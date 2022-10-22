package j12_Loops.L01_ForLoop.TASK.TasksÖdev;

import java.util.Scanner;

public class ödev03 {
    public static void main(String[] args) {
        /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
         * bir method create ediniz.
         *
         *  getAsalMi(int sayi)
         *  	return true/false

         * */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz :");
        int sayi = scan.nextInt();
        getAsalMi(sayi);
        System.out.println(getAsalMi(sayi));

    }

    private static boolean getAsalMi(int sayi) {
        boolean sonuc = true;
        int bolunmeSayisi = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                bolunmeSayisi++;
                sonuc=bolunmeSayisi==0;

            }

        }
return sonuc;
    }


}
