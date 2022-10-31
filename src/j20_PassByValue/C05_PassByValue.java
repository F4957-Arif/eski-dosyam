package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
         /*
        Her bir method'ta yapılan degısıklık kalıcı olsun ıstenırse
        1.degişiklik yapılan varıable lar atama tanımlanır
         */
        double etiketFiyati = 100;
        double indirimOrani=0.1;
        System.out.println("ındırım oncesı " +etiketFiyati);
        etiketFiyati=indirim(etiketFiyati,indirimOrani);
        System.out.println("ındırım sonrası: " +etiketFiyati);




    }//main sonu
    public static double indirim(double fiyat, double oran){
        return fiyat * (1 - oran);

    }





}
