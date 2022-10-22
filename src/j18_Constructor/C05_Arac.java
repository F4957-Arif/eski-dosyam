package j18_Constructor;

public class C05_Arac {//maın acmadık
    //field -->obj nın uretılırken alacagı deger varıables
   //bir Clasta birden çok cons tanımlanabılır
   //birden fazla cons creat edılecekse aynı olmamalı degerler
    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */
    int maxHiz;
    String model;

    public C05_Arac(int maxHiz) {//Bir paremetrelı constructor
        this(180, "hacı Murat");//2 p.li paremetreli cons call edıldı..ilk satıra yazılmalı yoksa CTE verir

        //this.maxH hız;//This keywoedparemtre degeri imst variablee atama yapar
        //obj maxHız degeri paremtrede olur
        this.maxHiz = maxHiz;
    }
    public C05_Arac() {//sefil pasremetresiz constructor
    }

    public C05_Arac(int maxHiz, String model) {//2 li constructor
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("agambu yazıyı okuduysan 2 paremetrelı cons. call edılmıstır");

    }
    public C05_Arac(String model, int maxHiz) {//2 li constructor paremetre sırası farklı
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("agambu yazıyı okuduysan 2 paremetrelı cons. call edılmıstır");

    }


}
