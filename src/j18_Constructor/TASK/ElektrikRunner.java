package j18_Constructor.TASK;

public class ElektrikRunner {
    public static void main(String[] args) {
        ElektrikHesap fatura1=new ElektrikHesap();
        fatura1.tuketımEkle(500);
        fatura1.tuketımEkle(300);
        System.out.println("fatura1.toplamTuketim = " + fatura1.toplamTuketim);
        System.out.println("fatura1.odenecekTutar() = " + fatura1.odenecekTutar());

        ElektrikHesap_Musteri musteri1=new ElektrikHesap_Musteri("Ahmet",fatura1);

    }
}

