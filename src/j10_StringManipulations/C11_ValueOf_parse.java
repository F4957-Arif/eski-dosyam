package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


        //TASK-->string type verilen 2 adet bagıs mıktarı toplayan kod creat edınız
        String bagıs1 = "1500";
        String bagıs2 = "2500";
        int bagısDegeri1 = Integer.valueOf(bagıs1);//bagıs1 string ıcındekı sayı degerını ınt e cevırdı bagosdegeri1 e atadı
        int bagısDegeri2 = Integer.valueOf(bagıs2);//bagıs2 string ıcındekı sayı degerını ınt e cevırdı bagosdegeri2 e atadı
        System.out.println("Toplam bagıs valueOf metodu ile : " + (bagısDegeri1 + bagısDegeri2));//4000 verır

        int fetih =Integer.valueOf("1453");
        System.out.println(fetih);//1453                            //not: BU METHOD STRİNGİ INT CEVIRIR


        System.out.println("toplam bagıs parseInt metodu ile  :" + (Integer.parseInt(bagıs1) + Integer.parseInt(bagıs2)));//4000 verir



        int tc=1234567;
        String strTc = String.valueOf(tc);
        System.out.println("strTc = " + strTc);//1234567
        System.out.println("strTc+tc = " + (strTc + tc));//

        String  fiyat="$150";//$ işaretini kaldırmak lazım
        int yeniFiyat=  Integer.valueOf(fiyat);
        System.out.println("yeniFiyat = " + yeniFiyat);


    }
}
