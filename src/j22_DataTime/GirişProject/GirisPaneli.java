package j22_DataTime.GirişProject;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {


    public static void giris(){
        Scanner sc=new Scanner(System.in);

        Kayıt yeniKayit=new Kayıt();//kayıt Class!a erısım ıcın paremetresiz Cons ıle yenıKayıt obj üretilid
        //kayıt Classtan obje olmadan method Call etmek ıcın methodlar statıc yapılırsa Clas name ıle call edılır
        ArrayList<Kullanıcı>kişi=new ArrayList<>();//Kullanıcı Class' dan uretılen obj tutulacagı bos list

        //cok onemli yere geldık diyor Hoca burada (şef tabagı)

        boolean cıkılsınMı=true;//whıle dongu ıcın sart tanımlandı
        while (cıkılsınMı){
            System.out.print("Agam ne istirsen \n1->Kullanıcı Kayıt Al\n2->Şanslı Kişi bul \n3->Listele\n4->Çıkış\nsecer misniz ?  ");
            int tercih= sc.nextInt();
            switch (tercih){
                case 1:
                    kişi=   yeniKayit.kayıtAl();//Kayıt Clastan yenıkayıt obj kayıtAl() method Call edıldı;
                    break;

                case 2:
                    yeniKayit.sanslıKullanıcı(kişi);
                    break;

                case 3:
                    yeniKayit.Listele(kişi);

                    break;

                case 4:
                    cıkılsınMı=false;

                    break;
                default:
                    System.out.println("agam adam gibi birşeyler giresen:(");
            }

        }

    }

    }


