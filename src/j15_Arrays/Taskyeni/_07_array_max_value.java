package j15_Arrays.Taskyeni;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */


        int sayi []={12,2,5,15,8};
        int enBuyukDeger=0;
        for (int i = 0; i < sayi.length ; i++) {
            if (enBuyukDeger<sayi[i]){
            enBuyukDeger=sayi[i];

        }
       }
        System.out.println(enBuyukDeger);

    }
}

