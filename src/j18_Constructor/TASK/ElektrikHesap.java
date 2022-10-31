package j18_Constructor.TASK;

import java.util.Scanner;

public class ElektrikHesap {
    /*  Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */
    int toplamTuketim;
    static double oran=0.7;
    double fatura;
    int kullanım;

    public ElektrikHesap() {
        this.toplamTuketim = toplamTuketim;
        this.oran = oran;
        this.fatura = fatura;
        this.kullanım= kullanım;



    }

    public void tuketımEkle(int i) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanım miktarınızı giriniz :");
        kullanım= scan.nextInt();
        toplamTuketim+=kullanım;

    }
    public double odenecekTutar(){
        fatura+=(toplamTuketim*oran);
        return fatura;
    }

}
