package j10_StringManipulations.task;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        //TASK--> Girilen String içindeki istenen indexdeki karekteri print eden kod creat edınız.

        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println("istenen karakterin index'ini giriniz : ");
        int index=sc.nextInt();

        if (str.length()>index){
            // System.out.println(str.substring(index, index + 1));
            System.out.println(str.charAt(index));
        }else System.out.println("girdiğiniz metinde olmayan index istiyorsunuz");






    }
}
