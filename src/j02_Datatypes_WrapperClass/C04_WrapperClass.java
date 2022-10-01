package j02_Datatypes_WrapperClass;

import com.sun.jdi.IntegerValue;

import javax.swing.*;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Arif";
        int yas=33;
        name.toLowerCase();
        System.out.println(name.toLowerCase());//Küçük yazdırı arif, İnt olmaz bu ilşem Örnek int. yazdıgımzda
        System.out.println(name.toUpperCase());//Büyük yazdırır ARİF
        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        //TASK id ve tc degerrlerinin toplamını print eden code yazınız
        String tc="12345645";//degişmesini istemediğimiz bilgiler çift tırnak
        String id="98765";
        System.out.println(tc+id);//böyle olmaz sadece topar
        int yeniTC=   Integer.valueOf(tc);//tc String degerini int cevirdi ve yeniTC'2' ye atadı.
        System.out.println("yeniTC = " + yeniTC);
        int yeniId=   Integer.valueOf(id);//tc String degerini int cevirdi ve yeniid'2' ye atadı.
        System.out.println("yeniId = " + yeniId);
        System.out.println(yeniTC+yeniId);//aritmatik toplama->12444410
        String okulNo="234543l";//okul numrası tanımlandı hatalı 'l' bilerek girildi 29. satırdaki hata verildi
        //int yeniOkulNo= Integer.valueOf(okulNo);//run time Exception->çalışma zamanı hatası at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        // System.out.println("yeniOkulNo = " + yeniOkulNo);



        //TASK->byte short int maximum ve minimum degerlerini print eden kod yazınız "primitive kodlar" Primitive olan yerde aksiyom olmaz non primitiver yap

        byte maxByteDegeri = Byte.MAX_VALUE;
        byte minByteDegeri = Byte.MIN_VALUE;

        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        short maxDegeri= Short.MAX_VALUE;
        short minDegeri= Short.MIN_VALUE;

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);


        int a=5;
        System.out.println(a);// 5
        System.out.println(5);// 5

    }
}
