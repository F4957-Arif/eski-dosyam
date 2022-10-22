package j014_Scope;

public class C02_staticVariable {
    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
   ogrenci notlari veya ogretmen branslari gibi
   bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

  Static variabler ise class variable olarak tanimlanir
  ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
  eger static variable'in degeri degistirilirse herkes icin degisir
*/
    static String firmaName="clarusway";//güneş
    static int firmaID;//güneş
    static boolean firmaIT;//Güneş

    public static void main(String[] args) {//maın bası
        System.out.println(firmaID);
        firmaID=1001;//statıc varıable name ile call edıldı->tavsıye edılen uygulama budur.
        System.out.println("firmaID = " + firmaID);
        C02_staticVariable.firmaIT=true;//classname ile statıc varıable call ->bad practice kot yanı tavsıye edılmez
staticMethod();//statıc method static maine call edıldı.->astral seyahet gibi
       // non_staticMethod()İstatıc olmayan sefil galaxsiye cıkamaz ama goktekıler gelır

    }//main dısı
    public static void staticMethod(){//statıc method-galaxy
        firmaID=2002;//statıc varıable call edıldı(Güneşten her yere erısım vardır)
        System.out.println("Agam yenı Id hayırlı olsun = " + firmaID);
    }
    public void non_staticMethod(){//statıc olmayan methodGüneşten her yere erişim vardır
        firmaName ="javaCAN";
        System.out.println("agam yernı fırman = " + firmaName);
    }
}
