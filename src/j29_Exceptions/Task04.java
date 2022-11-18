package j29_Exceptions;

public class Task04 {
    public static void main(String[] args) {
        //    randomSayi isminde static void bir method create ediniz.
//    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
//    Bu iki random sayının toplamını yazdırın.
//    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
//     ("Sayı 12'den küçük ise hata verir") print edin.

        randomSayi();
    }

    public static void randomSayi() {

        try {
            int sayi1=(int) (Math.random()* 10);
            int sayi2 =(int )(Math.random()*10);
            int toplam  =(sayi1 + sayi2);
            System.out.println("toplam = " + (sayi1 + sayi2));

            if (toplam<12){
                throw new ArithmeticException();
            }
        }catch (ArithmeticException e){
            System.out.println("Sayı 12'den küçük ise hata verir");
        }}}


