package j09_SwitchCase;

import java.util.Scanner;

public class C04_SwitchClase {
    public static void main(String[] args) {

      //girilen ay yıl hangi mevsimde print eden kod create ediniz
        Scanner Scan = new Scanner(System.in);
        System.out.print("bir ay gir kardeşşşşşş: ");
        int ayNo = Scan.nextInt();
        switch (ayNo){
            case 1  :
            case 2  :
            case 12 :
                System.out.println("Kış");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("İlkbahar ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar ");
                break;

            default:
                System.out.println("düzgün bir ay gir sen tam bir bombasın abi");
        }






















    }
}
