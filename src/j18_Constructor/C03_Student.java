package j18_Constructor;

public class C03_Student {//maın olmayan sadece student obje creat etmek ıcın pojo->plan object java oldobj ıcın standart clas kalıphane
    //fields

    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNumarası;
    boolean takdir;

    public void mezuniyet(){

        if (ortalama>=50){
            System.out.println("agam dıploman hayırlı olsun:)");
        }else System.out.println("agam seneye de bekleriz :(");
    }

    @Override
    public String toString() {//obj referans degeri print etmemesı ıcın obje datalarını Strınge cevıren method
        return "{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNumarası=" + okulNumarası +
                ", takdir=" + takdir +
                '}';
    }
}
