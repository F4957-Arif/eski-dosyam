package j18_Constructor;

public class C04_TeacherRunner {//paremetresız
    public static void main(String[] args) {
        C04_Teacher ogrt1=new C04_Teacher();//1 ögretmen
       ogrt1.ad="Muharrem";
       ogrt1.soyad="GÜZEL";
       ogrt1.branş="Qa";
       ogrt1.emekli=false;
       ogrt1.maaşı=23000;
       ogrt1.terübe=11;
       ogrt1.dersSaati();
        System.out.println(ogrt1);


        C04_Teacher ogretmn2=new C04_Teacher("ugur","JAVACI","dev",15,10000,333,false);//paremetrelı
        System.out.println("ogretmn2 = " + ogretmn2);//ogretmn2 = C04_Teacher{ad='ugur', soyad='JAVACI', branş='dev', terübe=15, maaşı=10000.0, id=333, emekli=false}

    }
}
