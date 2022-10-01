package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {

      //Length() methodu girilen Stringin uzunlugunu :içinde bulunan karekter sayısnı return ider.
      //return demek geri donus, cıktı vb. anlamındadır
      //Bütün karekterlerin(Boşluk vs. dahil) sayı adedini verir

        String str = "madem geldin dünyaya otur çalış javaya";

        int strKarekterSayisi =str.length();//int type bir data veriri
        System.out.println(str);//madem geldin dumyaya otur calıs javaya
        System.out.println(strKarekterSayisi);//38
        System.out.println(str.length());//38

        //String : karekter kumesi(iki tırnak arasındakı hersey)


        String str1 = "";//0 veriri bosluk yok tırnak ıcı
        System.out.println(str1.length());//0

        String str2 = " ";//1 verır 1 bosluk var
        System.out.println(str2.length());//1

        String str3 = null;
        System.out.println(str3.length());//Cte verırır Run time Eror hatası

       // str3.concat(str1);
        //TRİCK-> null atanan stringler String method çalışmaz cıssss bır ustu ornek

        /*
        null case sensitivedir yani Null veya NULL yazılamz
        null bir deger degıldır(dutluk:))sadece hiçliği gösteren bir pointerdir.(giriş işaretçi)
         */


        String name;//deklare edilmiş ama atanamamıs string calısmaz CTE verir altta ornek
        //vname.concat(str1)





























    }
}
