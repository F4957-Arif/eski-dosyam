package j22_DataTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZoneDateTime {
    public static void main(String[] args) {
        //herhangi bir ülke-sehir->local tarıh ve zaman bılgısını tutar
        LocalDate trhZone=LocalDate.now(ZoneId.of("America/New_York"));//America /NewYork Local in anlık tarıh bilgisi tanımlandı.
        LocalDate trhZone1=LocalDate.now(ZoneId.of("Japan"));//Japan Local in anlık tarıh bilgisi tanımlandı.
        System.out.println("trhZone = " + trhZone);
        System.out.println("trhZone1 = " + trhZone1);
        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/New_York"));
       // ZonedDateTime zdt3=ZonedDateTime.now(ZoneId.of("America"));//yerel saat dılımı tanımlanmalı
        ZonedDateTime zdt2=ZonedDateTime.now(ZoneId.of("Japan"));

        System.out.println("zdt1 = " + zdt1);
        System.out.println("zdt2 = " + zdt2);
       // System.out.println("zdt3 = " + zdt3);


    }
}

