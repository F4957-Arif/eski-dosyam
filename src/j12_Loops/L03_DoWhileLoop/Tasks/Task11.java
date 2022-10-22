package j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
            Scanner scan =new Scanner(System.in);
            int toplam =0;
            int girilen =0;
            int bitis =0;
            do {
                System.out.println("Lütfen bir sayi giriniz : ");
                int sayi= scan.nextInt();
                if (sayi>0){
                    toplam+=sayi;
                    girilen++;
                } else if (sayi==0) {
                    bitis++;
                    girilen++;


                }
            }while (bitis<1);
        System.out.println("Toplam "+toplam);
        System.out.println("Girilen sayi adedi : " +girilen);








    }
}
