package j09_SwitchCase;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

        //Girilen ay numarasına göre kaç gün çektiğini print eden bir kod print ediniz....

        Scanner scan = new Scanner(System.in);
        System.out.print("ay numarasını giriniz :");
        int ayNo = scan.nextInt();

        switch (ayNo){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 12 :
                System.out.println("girilen ay 31 gün içerir");
                break;
            case 4 :
            case 6:
            case 9 :
            case 11 :
                System.out.println("girilen ay 30 gün içerir");
                break;
            case 2 :
                System.out.print("yılınızı giriniz : ");
                int yil  = scan.nextInt();
                if(yil%4==0){
                    System.out.println("girilen ay şubat ayı 29 gün içerir");
                }else System.out.println("girilen ay 28 gün içerir");
                break;

            default:
                System.out.println("adam gibi birşey gir");
        }

    }
}
