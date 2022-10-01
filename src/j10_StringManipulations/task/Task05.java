package j10_StringManipulations.task;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {


        /*
        TASK--> Girilen String in son karekterini silen code creat edınız.....
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir Kelime giriniz : ");
        String str = scan.nextLine();

        System.out.println(str.substring(0, str.length() - 1));
        //str.replace(str.length() - 1, "");baska yol


    }
}
