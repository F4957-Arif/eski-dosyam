package j09_SwitchCase;

import java.util.Scanner;

public class C02_SwitchCase {

    public static void main(String[] args) {

        //TASK-> kullanıcının girdiği yılın ay sırasına göre ayın ısmını print eden kod creat edniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay giriniz");
        int ayNo = scan.nextInt();
        switch (ayNo) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("agam sizin köyde bir yılda kaç ay var :(");
        }
        }
    }






































