package j08_IfStatements_TernaryOperator;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        /*
        TASK-> Girilen bir karekterin harf olup olmadıgını kontrol edınız ?
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("bir karekter giriniz : ");

        char krktr = sc.nextLine().charAt(0);

        if ((krktr>='A'&&krktr<='Z')||(krktr>='a'&&krktr<='z')){
            System.out.println("giridiginiz karakter harfdir :)");
        }else System.out.println("girdiğiniz  karakter harf değildir :(");






















    }
}
