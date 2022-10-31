package j22_DataTime.GirişProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {
    ArrayList<Kullanıcı>kullanıcıKişiler=new ArrayList<>();//kullanıcı clas dan olusturulacak obj tutulacagı bos List yaptık
                //Task 2.step
    public ArrayList<Kullanıcı> kayıtAl() {//kullanıcı Class'dan obj üretmek için cons gerken name ve kayıt zamanı
                                           //bilgilerini olusturup olusan obj liste ekler
        Scanner sc=new Scanner(System.in);
        System.out.print("Adınızı giriniz :");
        String ad=sc.nextLine();//kullanıcı obj ıcın ad alındı name alındı
        Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());//k1 obj name kullanıcıdan kayıt zamanını LocalDateTime.now() alacak
        kullanıcıKişiler.add(k1);//olusturulan k1 obj liste eklendı

        return kullanıcıKişiler;//kullanıcı kısıler listi method cıktısını return olarak tanımlar.



    }
    //task 3.step
    public void sanslıKullanıcı( ArrayList<Kullanıcı>kllObj){//kullanıcı List' indekı obj' leri kayıtzamanını
                                                          //10sn den az olup olmamasına gore şanslı kullanıcı prın edecek.

        for (Kullanıcı k:kllObj) {//kullanıcı Class'dan katıy methodu ile üretilip kullanıcıKişi listine eklenen
                                 // Objeyi döngüue alır
            if (k.kayitZamanı.getSecond() <= 10) {//donguye alınan herbır kullanıcı obj kayıt
                                                    //10 sn kucuk olup olmamsını kontrol edıyoruz
                System.out.println(k.name + " agam şanslı kişisin 5 kg Bal kazandın:) sisteme giriş zamanın " + k.kayitZamanı);
            } else
                System.out.println(k.name + " agam şanslı kişi degılsin Bal'ı Nah' sıl kazanacaksın kovan yagmalandı:( sisteme giriş zamanın " + k.kayitZamanı);

        }

    }
    public void Listele(ArrayList<Kullanıcı>kllObj){
        System.out.println("kllObj = " + kllObj);//obj lerı kullanıcı Class dakı tosotrıng print eder


    }

}
