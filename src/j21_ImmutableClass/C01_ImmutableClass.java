package j21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1="Murat Bey";//ilk deger Murat Bey atanan str1 variable
        String str2="Murat Bey";//str1 ve str2 aynı ılk degere sahip oldugu ıcın Strıng havuzunda
        String str3=new String("Murat Bey");//degerleri aynı referansları farklı obje
        String str4=new String("Murat Bey");//degerlero aynı referansları farklı
        String str5=str1+"";

        System.out.println(str1 == str2);//True
        System.out.println(str1 == str3);//FAlse
        System.out.println(str1.equals(str2));//True
        System.out.println( str3 == str4);//FAlse
        System.out.println(str1 == str5);//FAlse
        System.out.println( str1.equals(str5));//True
    }
}
