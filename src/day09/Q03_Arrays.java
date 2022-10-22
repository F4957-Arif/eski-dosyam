package day09;

import java.util.Scanner;

public class Q03_Arrays {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir cumle tanimlayiniz");
        String a = sc.nextLine();
        String arr[] = a.split(" ");
        System.out.println(arr.length);
    }
}
