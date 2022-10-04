package day05;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz :  ");
        int sayi = scan.nextByte();
        System.out.println(sayioluştur(sayi));


    }

    public static boolean sayioluştur(int sayi) {
        return sayi%2==0 ? true : false;


    }

    Scanner scan =new Scanner(System.in);
    /* Write a method named isEven that accepts an integer argument.
 The method should return true if the argument is even, or false otherwise.*/
//1.Çözum :
    //  public static boolean isEven(int a){
    //    return a%2==0?true:false;
    //}


//2.Çözüm :
//Scanner scan = new Scanner (System.in);
//		System.out.println("Enter the number");
//    int a = scan.nextInt();
//		System.out.println(isEven(a));
//}
//    public static boolean isEven(int n) {
//        if (n%2 == 0) {
//            return true;
//        }else return false;
//    }












}
