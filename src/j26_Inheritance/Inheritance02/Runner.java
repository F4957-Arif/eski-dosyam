package j26_Inheritance.Inheritance02;

public class Runner {
    public static void main(String[] args) {
      //Data     Obj name        cons
        Kedi     k1=             new Kedi();
           /*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/

        System.out.println("k1.a = " + k1.a);//0->Hayvancık Classs
        System.out.println("k1.c = " + k1.c);//2->Kedi Class call edıldı
        System.out.println("k1.d = " + k1.d);//5->KEdi clasından call edıldı
        System.out.println("k1.m = " + k1.m);//1->Mammal class call edıldı
        k1.mA();
        k1.mC();
        k1.mM();

        /*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */


        System.out.println("         **********          ");


        Mammal k2=new Kedi("Kevser");//Datatype Parent Mammal Class cons ->paremetrelı kedı Clas
        System.out.println("k2.c = " + k2.c);//4 VAriable dataya gore
        System.out.println("k2.a = " + k2.a);//0       "
        System.out.println("k2.m = " + k2.m);// 1      "
        //k2. d-> obj data type Mamal Class d carıable yok call edılemez
        k2.mA();//HAYVANCIK  class meth call.
        k2.mC();// Kedi  class meth call.
        k2.mM();//Mammal  class meth call.
        //VAriable dateType ile
        //method cons ile bulunur aynı olanlarda


        Hayvancık k3=new Kedi();
        System.out.println("k3.m = " + k3.m);//3
        System.out.println("k3.a = " + k3.a);//0
        //k3.c->DataType Hayvancık Class oldugu ıcın cLass da olmayan c varıable call edılemez
        k3.mA();//HAYVANCIK  class meth call.
        k3.mM();// Mammal  class meth call.
        Mammal m1=new Mammal('$');
        System.out.println("m1.m = " + m1.m);//1
        System.out.println("m1.a = " + m1.a);//0
        System.out.println("m1.c = " + m1.c);//4
        //m1.d->parent Class Child Kedı Classdan variable call edemez
        m1.mA();//Hayvancık Class
        m1.mC();//Mammal Clas
        m1.mM();//Mammal clas

    }


}
