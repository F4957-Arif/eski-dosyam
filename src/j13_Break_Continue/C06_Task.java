package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        //Girilen bir ifadedekı c karekterıne kadar a karekter sayisini giriniz
        Scanner sc =new Scanner(System.in);
        System.out.print( " bir Kelime giriniz ");
        String birşeyler = sc.nextLine();//wgik Gabık
        int aSayısı =0;

        for (int i = 0; i <birşeyler.length() ; i++) {
            if (birşeyler.charAt(i)=='a'){
                aSayısı++;
            } else if (birşeyler.charAt(i)=='c') {
                break;

            }
            System.out.println("dongu işlemine giren karekterler: " + birşeyler.charAt(i));
        }

        System.out.println("metindeki a harfının adedi: "  +aSayısı);





    }
}
