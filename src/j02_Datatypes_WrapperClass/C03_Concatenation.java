package j02_Datatypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String  ad="Arif";
        String soyad="Bayrak";


        int a=7;
        int b=11;
        //Birden çok String variable ile farklı data type variable'ler + ile işleme alınırsa
        // java birleştirme yaparak yeni bir String oluşturur
        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable'a Concatenation yapılır.
        System.out.println(ad+soyad+a+b);//ArifBayrak711

        System.out.println(a+ad+soyad+b);//7ArifBayrak11

        System.out.println(a+b+ad+soyad);//18ArifBayrak

        System.out.println(" "+a+b);//   711

        System.out.println(ad+soyad+(a+b));//ArifBayrak18

        System.out.println((a+b)+ad+soyad);//18ArifBayrak

        System.out.println(ad+(a-b)+(a-b));//Arif-4-4
        System.out.println(ad+((a-b)+(a-b)));//Arif-4-4=-8
        char ch='1';//
        System.out.println(ad+ch);//Arif1
        System.out.println(a+ch+ad);//56Arif "ch ascii degeri 49"
        System.out.println(ad+(ch+b));//Arif60 "b=11 + ch degeri=49"
        System.out.println(a+ad+ch);//7Arif1
        /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
        eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
 */
        //1.Yol
        int sayi1=20;
        int sayi2=34;
        int sayi3;

      /*  sayi3=sayi1+sayi2;//54 oldu
        sayi1=sayi3-sayi1;//34
        sayi2=sayi3-sayi1;//20
        System.out.println("swap işlemi sonrası sayi1 degeri= "+sayi1);
        System.out.println("swap işlemi sonrası sayi2 degeri= "+sayi2);
        */




        //2.Yol
        System.out.println("swaptan önce sayı1 ->" +sayi1+","+"sayi2->"+sayi2);



    }
}
