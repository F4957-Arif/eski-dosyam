package j11_MethodCreation;

import java.util.Scanner;

public class Task04 {
    /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
        */
   static Scanner sc= new Scanner(System.in);
   static int bakiye =1000;

    public static void main(String[] args) {
        System.out.println("      *********       ");
        System.out.println("    **** ATM' ye Hoş geldiniz ***     ");
        System.out.println("      *********       ");
        System.out.print("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çekme -> 3\nÇıkış -> 4 : ");
        secim();//kol method yaptık
    }//maın dısı

    public static void secim() {
        System.out.println("agam yapacagın islemi seç : ");
        int seçim = sc.nextInt();
        switch (seçim){
            case 1 :
               bakiyeVer();

                break;

            case 2 :
                paraYatir();
                break;

            case 3 :
                paraCek();
                break;

            case 4 :
                çıkısYap();
                break;
            default:
                System.out.println("Agam daha secim yapamıyorsun sen");
                secim();

        }
    }

    private static void çıkısYap() {
        System.out.println("agam yine beklerız cıkısnız yapılmıstır selametle güzel insan:)");
    }

    private static void paraCek() {
        System.out.println("agam ne kadar cekeceksin:");
        int çekilecekMiktar = sc.nextInt();
        if (çekilecekMiktar<=bakiye){
            bakiye-=çekilecekMiktar;
            System.out.println("agam para cebınde gözun aydın ");
            System.out.println("agam bakiyen :"+bakiye);
            karar();
        }else System.out.println("agam nettın olmayan parayı mı cekıcen :)");
    }

    private static void paraYatir() {
        System.out.println("Agam elin tutulmaz ne kadar yatıracaksın : ");
        int yatirilacakTutar = sc.nextInt();
        bakiye+=yatirilacakTutar;
        System.out.println("agam para hesabında ahanda yenı bakıyen"+bakiye);
        karar();
    }
    private static void bakiyeVer() {
        System.out.println("agam bakiye : "+bakiye);
        System.out.println("agam isleme devamkee ise--->1 \nyeter ise--->0");
        int karar = sc.nextInt();
        if (karar==00){
            çıkısYap();
        }else secim();
    }
public static void karar(){
    System.out.println("agam isleme devamkee ise--->1 \nyeter ise--->0");
    int karar = sc.nextInt();
    if (karar==1){
        System.out.print("MÖNÜÜÜ :-)\nBakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çekme -> 3\nÇıkış -> 4 : ");
        secim();

    }else if (karar==0)çıkısYap();
    else System.out.println("agam adam gibi karar gir");
}

}
