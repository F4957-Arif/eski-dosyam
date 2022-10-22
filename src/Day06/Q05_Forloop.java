package Day06;

import java.util.Scanner;

public class Q05_Forloop {
    /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Lütfen satır sayısı giriniz ");
        int satırSayi = sc.nextInt();
        System.out.println("Lütfen sutun sayısı girininz :");
        int sutunSayi = sc.nextInt();
        for (int i = 1; i <= satırSayi; i++) {
            for (int j =1 ; j <= sutunSayi; j++) {
                System.out.print("*  ");

            }
            System.out.println();//dumy bu bosluk olmazsa hepsını yanyana yqazar
        }










    }
}
