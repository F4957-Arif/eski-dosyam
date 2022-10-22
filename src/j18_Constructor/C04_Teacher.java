package j18_Constructor;

public class C04_Teacher {//ogretmen obje ureten kalıphane class yanı
    String ad;
    String soyad;
    String branş;
    int terübe;
    double maaşı;
    int id;
    boolean emekli;

    public  void  dersSaati(){


        System.out.println("agam haftada 20 saatten sonrası exstraye girer");
    }

    public C04_Teacher() {//
    }

    //king of trick-> paremetreleı cons defaultu ezer
    public C04_Teacher(String ad, String soyad, String branş, int terübe, double maaşı, int id, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.branş = branş;
        this.terübe = terübe;
        this.maaşı = maaşı;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", branş='" + branş + '\'' +
                ", terübe=" + terübe +
                ", maaşı=" + maaşı +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }
}
