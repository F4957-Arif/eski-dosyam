package j18_Constructor;

public class C02_Arac {

   //maın dısı ozellık gırelım
    String marka;
    String model;
    int km=10;
    double motorHacim;
    boolean vitesAuto=false;

    boolean ikinciEl;
    int yil;

    public static void main(String[] args) {
        //obje clasta yapılır
        C02_Arac arac1=new C02_Arac();//default cons ıle arac1 obje create edıldı
        arac1.ikinciEl=true;
        arac1.marka="Skoda";
        arac1.km=5000;
        arac1.model="Superb";
        arac1.motorHacim= 1.6;

        //                        Skoda          Superb              5000             0                    true                   1.6
        System.out.println(arac1.marka + " " + arac1.model + " " + arac1.km + " " + arac1.yil + " " + arac1.ikinciEl + " " + arac1.motorHacim);

        //task-> 2 bir aracın tum field'larını atayarak print edınız

        C02_Arac myCar=new C02_Arac();//default cons ıle arav2 obje createdıldı
        myCar.ikinciEl=true;
        myCar.marka="Opel";
        myCar.km=5000;
        myCar.model="Astra";
        myCar.motorHacim= 1.6;
        myCar.vitesAuto=true;
        myCar.yil=2022;
        System.out.println(myCar.marka + " " + myCar.model + " " + myCar.km + "km " + myCar.yil + " " + myCar.ikinciEl + " " + myCar.motorHacim+"cc"+myCar.vitesAuto);


        System.out.println("myCar = " + myCar);//myCar = j18_Constructor.C02_Arac@5c7fa833
                                               //myCar = C02_Arac{marka='Opel', model='Astra', km=5000, motorHacim=1.6, vitesAuto=true, ikinciEl=true, yil=2022}
                                               //45 te meof olustduk sag gilk generate /toSitrink/ok
    }//main dısı

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                '}';
    }
}
