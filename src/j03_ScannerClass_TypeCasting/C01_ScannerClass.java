package j03_ScannerClass_TypeCasting;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        //Kullanıcıdan veri almak için şu adımları taki ediniz
        //1.adım->Scanner class'dan abje create edilir

        //Scanner scan = new Scanner(System.in);//scanner classından scan isminde degerini System içinden alan bir obje
        //2.adım->Kullanıcıdan istenen veri için bildirimde bulunur yani ->sout("");

        //System.out.print("adınızı giriniz :");
        //3.adım->Kullanıcının girdiği veri data type'ne göre bir variable atanır
        //String isim = scan.nextLine();//kullanıcan gelen Strting tipinde isim verisi scan objesi'ni nextLine() methodu ile atar

        //System.out.println("isim = " +isim);

        //TASK->Kullanıcının girdiği degere göre kare alanı ve çevresini hesaplayan bir code yazınız

       // Scanner sc = new Scanner(System.in);//1.Adım
        //System.out.print("karenin kenarı giriniz :");//2.adım
       // int kenar = sc.nextInt();//3.adım
        //System.out.println("alan :"+(kenar*kenar)+", çevre :"+kenar*4);







        /*
        Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
        Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
        1 seker = 1.7 gr
        Ornek : Input : cay sayisi : 10 seker sayisi :2
        Output : Yilda 12.41 kg seker kullaniyorsunuz
        */
        //Scanner sca = new Scanner(System.in);//1.Adım
        //System.out.println("günlük içtiğiniz çay sayısnızı giriniz:");//çay için 2.Adım
        //int caySayısı = sc.nextInt();//çay için 3 adım


        //System.out.println("şeker sayınızı giriniz :" );//şeker için 2.adım
        //int seker = sc.nextInt();//şeker için adım

        //System.out.println("yıllık seker tüketiminiz : "+(caySayısı*seker*1.7*365+"kg"));

        Scanner sc = new Scanner(System.in);
        System.out.println("isminizi giriniz :" );
        char ch = sc.nextLine().charAt(0);//kullanıcıdan geleln 0. indekx ilk karekterini alır.2 karekter olsa başka harf vs
        System.out.println("İsminizin ilk karekteri : " +ch);
        String isimSoyad = sc. nextLine();//kullanıcın girdiği tüm satırı isim'e atar
        String ad = sc. next();//kullanıcın girdiği ilk ifadeyi ad'a atar atar

        System.out.println("adınızı giriniz : "+ ad);

    }
}
