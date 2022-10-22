package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Student ogernci1=new C03_Student();//ogrenci1 obj creat edıldı
        ogernci1.ad="Fatih";
        ogernci1.soyad="JAVACI";
        ogernci1.sınıf=1;
        ogernci1.okulNumarası=1001;
        ogernci1.ortalama=77;
        ogernci1.takdir=true;

        System.out.println("ogernci1 = " + ogernci1);//ogernci1 = {ad='Fatih', soyad='JAVACI', sınıf=1, ortalama=77.0, okulNumarası=1001, takdir=true}

        ogernci1.mezuniyet();//agam dıploman hayırlı olsun:)C03 classında method olustrudk

       //task->diger bir ogrenci obj ile tum fie
        C03_Student ogrenci2=new C03_Student();
        ogrenci2.ad="Hatice";
        ogrenci2.soyad="JANDARMA";
        ogrenci2.sınıf=2;
        ogrenci2.okulNumarası=1004;
        ogrenci2.ortalama=40;
        ogrenci2.takdir=false;
        ogrenci2.mezuniyet();//agam seneye de bekleriz :(
        System.out.println("ogrenci2 = " + ogrenci2);//ogrenci2 = {ad='Hatice', soyad='JANDARMA', sınıf=2, ortalama=40.0, okulNumarası=1004, takdir=false}



    }


}
