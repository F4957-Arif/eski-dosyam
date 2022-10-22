package j15_Arrays.Task;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        Scanner scan =new Scanner(System.in);
        Scanner sc=new Scanner(System.in);


        int arr[]= new int[5];
        for (int i = 0; i <5 ; i++) {

            System.out.println(i+". sayı gir:");

            arr[i]=sc.nextInt();
        }
        for (int i = 4; i >=0 ; i--) {

            System.out.println(arr[i] + " ");
        }
        /*
        Scanner sc=new Scanner(System.in);
		int sayiArr[]=new int[5];
		int tersArr[]=new int [sayiArr.length];
		for (int i = 0; i < sayiArr.length; i++) {
			System.out.print("Sayı girin:  ");
			sayiArr[i] = sc.nextInt();
		}
		tersArr[tersArr.length-1]=sayiArr[0];

		for (int i = 0; i < tersArr.length; i++) {
			tersArr[(tersArr.length-1)-i]=sayiArr[i];
		}
		System.out.println(Arrays.toString(tersArr));

		 /* TASK :
         */
    }
}
