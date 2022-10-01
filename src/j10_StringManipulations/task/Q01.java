package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir cümleyi giriniz : ");
        String cümle = input.nextLine();
        if (cümle.contains(" ")){
            System.out.println("yazdıgın cümle bosluk ıcerır");
        }else
            System.out.println("yazdıgın metinb boşluk içermez");















    }
}

