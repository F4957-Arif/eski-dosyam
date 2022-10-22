package day08;

import java.util.Scanner;

public class istenılenSayiKadar {
    public static void main(String[] args) {
        /*
While döngüsünü kullanarak kullanıcının istediği kadar sayıyı toplayabildiği bir uygulama yazın.


 */
        Scanner scan =new Scanner(System.in);
        double toplam=0;
        double girdi=-1;
        int adet=1;
        while (girdi!=0){
            System.out.println("toplanacak sayıları giriniz ....(çıkmak için 0 yazınız)");
            girdi= scan.nextDouble();
            toplam+=girdi;
            adet++;
            System.out.println();
            System.out.println("toplam = " + toplam);
        }
        System.out.println("toplam = " + toplam);


    }
}
