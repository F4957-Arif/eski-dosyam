package j22_DataTime.GirişProject;

import java.time.LocalDateTime;
//Task 1.Step
public class Kullanıcı {//kalıphane
    String name;//obj de deger alacak ınst varıable
    LocalDateTime kayitZamanı;


    public Kullanıcı(String name, LocalDateTime kayitZamanı) {//full parametrelı teleskopik cons
        this.name = name;
        this.kayitZamanı = kayitZamanı;

    }
    @Override
    public String toString() {//bu clas dan olusturulan obj print etmek ıcın obj datalarını strınge cevırır
        return
                "name='" + name + '\'' +
                        ", kayitZamanı=" + kayitZamanı +
                        '}';
    }
}
