package j08_IfStatements_TernaryOperator.taks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */
        Scanner scan =new Scanner(System.in);

        System.out.println("lütfen birinci ondalık değeri giriniz:");
        double double1= scan.nextDouble();

        System.out.println("lütfen ikinci ondalık değeri giriniz:");
        double double2 = scan.nextDouble();

        if (double2>double2){
            System.out.println("double 1 is greater than double 2");
        }else {
            System.out.println("double 1 is smaller than double 2");
        }



    }
}
