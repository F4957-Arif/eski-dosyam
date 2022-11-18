package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList....
        1-LinkedList'de elemanlar "data" saklayan ve "adres" olmak üzere ili kısımdan oluşur ve eleman yerine "node" olarak tanımlar..
        2-LinkedList'de ilk node olmayan data barındırmayan sadece adres bulunduran "head" node tanımlanmıstır.
        3-LinkedList'de son node adres kısmı null olan sadece data bulunduran "tail" kuyruk olarak tanımlanmıstır.
        4-ArrrayList searching LinkedList node ekleme ve silmede daha avantajlıdır.LinkedList eleman bulmada index yapısı olmadgı için başarısızdır.
        5-LinkedList -->Tren vagon ılıskısı baglantısı gibi dusünülebilir
        6-Collection abj tanımlanırken consracter Class(LinkedList, ArrayList..... ) olmalı.İnterface(List Queue ....)olmamasına dikkat edılmelı.
            Ancak obj DataType olarak parent interface tanımlanabılır.
        7-LinkedList Class iki tane parent interface 'den(List ve Queue) ımplement etmiştir.
         */
        LinkedList <String> ll1 =new LinkedList<>(Arrays.asList("Ebubekir", "Gülsüm", "Adem", "İlker", "Merve"));//LinkedList-->declare ettik hemde atama yaptık
        //LinkedList print
        System.out.println("ll1 = " + ll1);// [Ebubekir, Gülsüm, Adem, İlker, Merve]
        // LinkedList add()6 tane var çünkü uzmanlık alanı eklemek ve cıkartmaktır
        ll1.add("Uğur");
        System.out.println("24 satır ll1 = " + ll1);//[Ebubekir, Gülsüm, Adem, İlker, Merve, Uğur]
        ll1.add(2,"Abdulaziz");
        System.out.println("26 satır ll1 = " + ll1);//[Ebubekir, Gülsüm, Adem, İlker, Merve, Uğur]
        ll1.addFirst("JavaCAN");
        System.out.println("28 satır ll1 = " + ll1);//[JavaCAN, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, Uğur]
        ll1.addLast("JavaTAR");
        System.out.println("30 satır ll1 = " + ll1);// [JavaCAN, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, Uğur, JavaTAR]

        List<String > ll2 =new LinkedList<>(Arrays.asList("Fatih","Erol","Nur"));//DaTAtype interface List olan LinkedList
        ll1.addAll(ll2);
       //ll1.addAll("agam");//CTE paremetre Call olmazsa
        System.out.println("34 satır ll1 = " + ll1);//[JavaCAN, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, Uğur, JavaTAR, Fatih, Erol, Nur]
        ll1.addAll(3,ll2);
        System.out.println(" 38 satır ll2 = " + ll1);// [JavaCAN, Ebubekir, Gülsüm, Fatih, Erol, Nur, Abdulaziz, Adem, İlker, Merve, Uğur, JavaTAR, Fatih, Erol, Nur]

    }
}
