package j18_Constructor;

public class C07_Ogrtm {//ogretmen obj ıcın kalphane

    //Fields
    String isim;
    int tecrube;
    int kıdem=5;

    public C07_Ogrtm(String isim, int tecrube) {//2pli cans
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public void kıdemHesapla(int kıdem){//int paremetrelrı void methot
        System.out.println("agam kıdemın : "+(kıdem*2));
        System.out.println("agam kıdemın : "+(this.kıdem*2));
    }
}
