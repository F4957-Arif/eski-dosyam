package j22_DataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        //LocalDateTime->tarih(yıl,ay.gün) ve zaman (saat,dakika,saniye)bilgilerini tutar
        LocalDateTime ldt=LocalDateTime.now();//mevcut tarıh zaman saat sanıye
        System.out.println("ldt = " + ldt);
        LocalDate d=LocalDate.of(2016,3,13);//Tarıh atamasdı yapıldı
        LocalTime t=LocalTime.of(14,45,35);//zaman ataması yapıldı
        LocalDateTime trhZmn=LocalDateTime.of(d,t);
        System.out.println("trhZmn = " + trhZmn);
        LocalDateTime ldt1=LocalDateTime.of(2018, Month.MAY,19,20,30);
        System.out.println("ldt1 = " + ldt1);
        System.out.println("trhZmn.getDayOfMonth() = " + trhZmn.getDayOfMonth());
        System.out.println("trhZmn.getHour() = " + trhZmn.getHour());
        System.out.println("trhZmn.getDayOfWeek() = " + trhZmn.getDayOfWeek());
        System.out.println("trhZmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72) = " + trhZmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72));


    }
}
