package j02_Datatypes_WrapperClass;

public class C01_VariableCreate {
    public static void main(String[] args) {
        //1. yol -> best practice "Recomended" tavsiye edilen
        int yas=32;//"degeri 48 olan int tipinde yas isminde variable tanımlandı
        int maas=33000;//"degeri 33000 olan int tipinde maas isminde variable tanımlandı
        System.out.println("yas");//yas "yas ifadesi print edildi
        System.out.println(yas);//48    "yas variable çağrılarak deger verildi
        System.out.println(maas);//33.000;
        System.out.println("nur hanım başlangı maası : "+maas);//33.000;//nur hanım başlangıç maaşı : 3300
        //2. Yol
        int boy; // degeri atanmayan boy isminde bir int tanımlandı declaration
        //System.out.println(boy);//degeri atanmamıs değiskeni hiç bir aksiyonda kullanılamaz CTE
        boy=175;
        System.out.println("boyunuz: "+boy);//175
        //3. Yol
        int yevmiye, age, kilo;//birden çok aynı tipte değişken tanımlandı
        age=32;
        yevmiye=1000;
        kilo=75;//tanımlama degıskenlere deger ataması yapıldı

        int gunluk=1500,  yil =2022, agirlik=99;
                //TRICK bir variable sadece bir kez tanımlanabilir birden çok değer atanabilir
        System.out.println(gunluk);//1500

        gunluk=1800;//günlük yeni değeri 1800 olarak atandı.
        System.out.println("gunluk son degeri :"+gunluk);
        System.out.println("gunluk degeri:"+gunluk+"yıl degeri:" +yil+" "+yas+" "+yevmiye+" "+agirlik);

        /*
         //Soru-1 :   konsola      "Hello ", "World  \ /"   seklinde yazdırınız

        System.out.println("\"Hello \", \"World  \\ /\"");
         */

        // cevap 1 :
        System.out.println("\"Hello \", \"World \\/\"");

        // Soru-2 : Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.
        // cevap 2 :
        System.out.println("\nP\nA\nZ\nA\nR\nT\nE\nS\nİ");
        //Soru-3 : "Java" ile hayat cok 'afilli'   yazdırınız
        //cevap-3:
        System.out.println("\"Java\" ile hayat cok \'afilli\'");
        // soru-4: "Basarı" gayrete 'asiktir'
        System.out.println("\"başarı\"gayrete\n\'asıktır\'");
        //soru-5:"Clarusway ile java cok kolay ..." ifadesi  3 satır sonra ve satır basından 1 tab ileride yazılsın.

        System.out.println("\n\n\n \t\"clarusway ile hayat çok kolaydır...\"");

        System.out.println("nkatılımcı: Arif Bayraktutar\nkilo: 79\nyas: 32\nmeslek: memur\nhobiler:yüzmek ve spor yapmak");























































    }
}
