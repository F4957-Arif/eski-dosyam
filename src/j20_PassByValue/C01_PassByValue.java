package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Java Pass By Value bir programa dilidir
        Bir primitiv variable arguman olarak bir methoda call edıldıgıne varıable
        degıl bir copy clone(vesıkalıkı)(poınter)degeri gonderilir.
         */
        //task->verılen fıyat için %24 artılırmış fiyatı orınt edden method creat edınız
        double fiyat=100;
        System.out.println("method call oncesı fiyat degeri = " + fiyat);
        fiyatartır(fiyat);
        System.out.println("method call sonrası fiyat degeri "+ fiyat);
    }//

    public static void fiyatartır(double birşey){
        birşey*=1.24;
        System.out.println("artırılmış fiyat " + birşey );


    }
}
