package j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task10_Nested {
    public static void main(String[] args) {

/*
girilen bir ifadenin istenen harf sayısını print eden bir code creat edınız
input=selam javaCAN'lar
output : a sayısı : 3
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz : ");
        String cumle = sc.nextLine();
        System.out.println("Lütfen sayılacak harf(karekter) giriniz ");
        char harf = sc.next().toLowerCase().charAt(0);
        int harfSayisi=0;//ilk deger sıfır atandiki saymada etkı etmesın
        for (int i =0; i<=cumle.length()-1; i++){
            if (cumle.charAt(i)==harf){
                harfSayisi++;
            }

        }
        System.out.println("girdiginiz cumle : " +cumle+ " de istediginiz harf " +harf + " "+  harfSayisi+ " kadar var");

















    }
}
