package j17_ForEachLoup;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
        for-each loop for loop' un gelişmiş halidi
        1.clean code -yazım kolaylıgı
        code okuma kolaylıgı
        hata yapma rıskını azaltır

         */
      List<Integer>sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));

      //task list elemanları ayrı satırlara prınt edınız
        for (int i = 0; i < sayiList.size(); i++) {
            System.out.println("fori ile+\" \" = " + sayiList.get(i) + " ");

        }
        for (Integer a:sayiList) {
            System.out.println("for-each ile+\" \" = " + a + " ");

        }
        //task list elemanları ılk 3 eleman harıc tek olanları prınt edınız

        for (Integer a:sayiList.subList(3,sayiList.size())) {
            if (a%2==1){
                System.out.println("a+\" \" = " + a + " ");
            }
        }
        //task list elemanlarını 2 ile 5 ındex arasındakı 2,3,4,5 elşemanlarını toplamını prınteden code creat edınız
        int toplam=0;
        for (int a:sayiList.subList(2,6)) {
            toplam+=a;

        }
        System.out.println("toplam = " + toplam);
    }
}
