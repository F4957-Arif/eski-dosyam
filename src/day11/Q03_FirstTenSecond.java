package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Q03_FirstTenSecond {
    public static void main(String[] args) {
        //Local time ile her dakıkanın ilk 10 saniyesı

        LocalDateTime time = LocalDateTime.now();
        System.out.println("şu ankı zaman = " + time);
        if (time.getSecond()<=10){
            System.out.println("\"ilk 10 sn içinde\" = " + "ilk 10 sn içinde");
        }else System.out.println("\"ilk 10 saniye dısında\" = " + "ilk 10 saniye dısında");
    }//System.out.println((simdi.getSecond()<=10)?"Evet" : "Hayır"); Ternary ile
}
