package j18_Constructor;

public class C07_OgrtmRunner {
    public static void main(String[] args) {
        C07_Ogrtm hcm=new C07_Ogrtm("SevdeNur Öğretmen:) ",11);
        System.out.println("hcm.isim = " + hcm.isim);//SevdeNur Öğretmen:)
        System.out.println("hcm.kıdem = " + hcm.kıdem);//5
        hcm.kıdemHesapla(13);//agam kıdemın : 26
                             //agam kıdemın : 10
    }
}
