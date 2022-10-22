package j15_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    /*
    Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
    Array olusturulurken 2 seyi declare etmeliyiz:
    1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
    2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
    array= tepsiye benzer..
    Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
     isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
     */
    public static void main(String[] args) {

        int a;//declare edılen ama atanamayan primitive date
        int Arr[];//declare(tanımlanan )edılen ama atanmayan int type array
        //tanımlanan array atama yapılmadan kullanılmaz
        String isimArr[]={"muharem", "cafer","ökkeş"," bilalHilal"};//hem tanımlama hem atama yapılan strıng array
        //String []isimArr1={"muharem", "cafer","ökkeş"," bilalHilal"};//hem tanımlama hem atama yapılan strıng array
        int sayiArr[]=new int[5];//java heap memorhy de 5 default ->0 olan ınt arrey creat edıldı.
                                 //[0,0,0,0,0,]
      //Array a elamen ekleme
        sayiArr[2]=34;
        sayiArr[0]=35;
        sayiArr[1]=34;
        sayiArr[3]=61;
        sayiArr[0]=34;//0 index array elamnı 34 degeri ile uptade edıldı
        //array elamanı uniqe olmak zorunda degıldır tekrar array elamnı olabılır

        //array elaman sayısı boyut degeri....
        System.out.println("sayiArr.length = " + sayiArr.length);//5
        //array son elamnını bulun
        System.out.println("array son " + isimArr [isimArr.length - 1]);//bilalHilal
        isimArr[isimArr.length-1]="OA Özge hanım";//array son elamn uptade edildi
        //array de olmayan elamn

        //okkalı bir TRICL-> sayiArr[11]=23;//cte vermez ama olmayan elamnet rte verır->array run tıem da olsur.
        //Array elamnları print etme
        for (int i = 0; i <isimArr.length ; i++) {
            System.out.println(isimArr[i]+ " ");

        }
        System.out.println();
        System.out.println("isimArr = " + isimArr);//[Ljava.lang.String;@614c5515( isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır)
        System.out.println(Arrays.toString(isimArr));//isim ARray stringe cevirdi
        //TASk->sayıların elamnlarından degeri tek olanları yazdırınız.

        for (int i = 0; i <sayiArr.length ; i++) {
            if (sayiArr[i]%2==1){
                System.out.println(sayiArr[i] + " ");
            }

        }
        
        //task->sayıArr cift ındex elamanları print eden code creat edınız
        //1.yol
   //     for (int i = 0; i <sayiArr.length-1 ; i++) {
     //       if (i%2==0){
       //         System.out.println("index cift olan " + i);
         //   }
    //    }
        for (int i = 0; i <sayiArr.length-1 ; i+=2) {
            System.out.println(sayiArr[i] + " ");

        }

        //task->isimArr 5 harflı elamanlarından olusan arrayın elamnlarını print eden code creat edınız.

        String yeniArR[]=new String [isimArr.length];//isimArr elamanı kadar bos yenı arry attık
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length()==5){
                yeniArR[i]=isimArr[i];

            }

        }

        System.out.println("Arrays.toString(yeniArR) = " + Arrays.toString(yeniArR));
        Arrays.sort(isimArr);
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));
        Arrays.sort(sayiArr);
        System.out.println(Arrays.toString(sayiArr));
        /*
        //Array elemanları naturel(k->b:ascending b->k:descending, alfabetik) sıralama için sort(); method kulanılır
System.out.println(Arrays.toString(isimArr));//sıarlama öncesi-> [muharrem, enise, cebrail, nazım, QA Özge hanım]
Arrays.sort(isimArr);//isimArr elemanları naturel sıralama yapıldı
System.out.println(Arrays.toString(isimArr));//sıralama sonrası -> [QA Özge hanım, cebrail, enise, muharrem, nazım]

System.out.println(Arrays.toString(sayıArr));//sıralama öncesi sayıArr->[34, 43, 34, 99, 0]
Arrays.sort(sayıArr);// sayıArr k-> b sıralandı
System.out.println(Arrays.toString(sayıArr));//sıralama sonrası sayıArr-> [0, 34, 34, 43, 99]



         */
    }
}
