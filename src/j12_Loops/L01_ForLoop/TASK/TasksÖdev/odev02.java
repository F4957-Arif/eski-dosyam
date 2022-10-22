package j12_Loops.L01_ForLoop.TASK.TasksÖdev;

import java.util.Scanner;

public class odev02 {
    /*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");
        String metin = scan.nextLine().trim().toLowerCase();
        sayiHesapla(metin);



    }

    private static void sayiHesapla(String metin) {
        int deger = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) >= 48 && (metin.charAt(i) <= 57)) {
                ;
                deger++;
            }

        }
        System.out.println(deger);
    }




}
