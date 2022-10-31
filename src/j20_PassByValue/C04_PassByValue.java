package j20_PassByValue;

public class C04_PassByValue {
    static double etıketFiyat;//
    static double indirimOrani;//gunesler
    public static void main(String[] args) {
        /*
        Her bir method'ta yapılan degısıklık kalıcı olsun ıstenırse
        1.Yol degısıklık yapılan varıableler statıc olarak tanımlanır.

         */

        etıketFiyat=100;
        System.out.println("indirim oncesi " + etıketFiyat);

        indirimOrani=0.1;
        indir();//method call

        indirimOrani=0.1;
        indir();

        indirimOrani=0.1;
        indir();
        System.out.println("indirim sonrası etiket fiyati : "+etıketFiyat);


    }//main sonu
    public static void indir(){
        etıketFiyat*=(1-indirimOrani);
        System.out.println("etıketFiyat = " + etıketFiyat);

    }
}
